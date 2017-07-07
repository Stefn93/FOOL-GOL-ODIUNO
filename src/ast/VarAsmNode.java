package ast;

import java.util.ArrayList;
import java.util.HashMap;

import util.Environment;
import util.SemanticError;
import lib.FOOLlib;

public class VarAsmNode implements Node {

    private String id;
    private Node type;
    private Node exp;
    private STentry entry;

    public VarAsmNode(String i, Node t, Node v) {
        id = i;
        type = t;
        exp = v;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //env.setOffset(-2);
        HashMap<String, STentry> hm = env.getSymTable().get(env.getNestingLevel());

        entry = new STentry(env.getNestingLevel(), type, env.getOffset()); //separo introducendo "entry"
        env.decOffset();

        if (hm.put(id, entry) != null)
            res.add(new SemanticError("Var id " + id + " already declared"));

        res.addAll(exp.checkSemantics(env));

        String classInstance = "";
        // Memorizzo nel method environment il tipo con cui istanzio l'oggetto.
        if (exp instanceof NewExpNode) {
            classInstance = ((NewExpNode) exp).getClassId();
        } else {
            ArrowTypeNode arrowType = null;
            if (exp instanceof CallMetNode) {
                arrowType = ((CallMetNode) exp).getArrowType();
            } else if (exp instanceof CallFunNode) {
                arrowType = ((CallFunNode) exp).getArrowType();
            }

            assert arrowType != null;
            type = arrowType.getRet();
            classInstance = ((ClassIdNode) type).getClassId();
        }

        HashMap<String, String> ohm;
        try {
            ohm = env.getObjectEnvironment().get(env.getNestingLevel());
        } catch (Exception e) {
            ohm = new HashMap<>();
            env.getObjectEnvironment().add(ohm);
        }
        ohm.put(id, classInstance);

        return res;
    }

    public String toPrint(String s) {
        return s + "Var:" + id + "\n"
                + type.toPrint(s + "  ")
                + exp.toPrint(s + "  ");
    }

    //valore di ritorno non utilizzato
    public Node typeCheck() {
        if (exp.typeCheck() instanceof ClassIdNode && type instanceof ClassIdNode) {
            if (!FOOLlib.isSubtype(((ClassIdNode) exp.typeCheck()).getClassId(), ((ClassIdNode) type).getClassId())) {
                System.out.println("Incompatible class for object " + id);
                System.err.println("Fatal error during type checking");
            }

            //Imposto il tipo dell'oggetto con il tipo con cui è stato istanziato
            //se è sottotipo del tipo con cui è stato dichiarato.
            entry.setType(exp.typeCheck());
        } else {
            if (!(FOOLlib.isSubtype(exp.typeCheck(), type))) {
                System.out.println("Incompatible value for variable " + id);
                System.err.println("Fatal error during type checking");
            }
        }
        return null;
    }

    public String codeGeneration() {
        return exp.codeGeneration();
    }

}  