push 0
push 0
lhp
sw
push 1
lhp
add
shp
push 7
lhp
sw
push 1
lhp
add
shp
push 3
lhp
sw
push 1
lhp
add
shp
lhp
push 1
lhp
sw
push 1
lhp
add
shp
push 6
lhp
sw
push 1
lhp
add
shp
push 3
lhp
sw
push 1
lhp
add
shp
lhp
push -3
lfp
add
lw
sop
lfp
lfp
push getAge6Animale7
js
push -3
lfp
add
lw
sop
lfp
lfp
push quantoViveAncora16BullDog7
js
add
print
halt

getAge6Animale7:
cfp
lra
push -2
lop
add
lw
srv
sra
pop
sfp
lrv
lra
js

isAlive7Animale7:
cfp
lra
push -3
lop
add
lw
srv
sra
pop
sfp
lrv
lra
js

quantoViveAncora16Cane4:
cfp
lra
push -3
lop
add
lw
push 1
beq label0
push 0
b label1
label0:
push -2
lop
add
lw
push 15
beq label4
push 0
b label5
label4:
push 1
label5:
push 1
beq label2
push 1
b label3
label2:
push 15
push -2
lop
add
lw
add
label3:
label1:
srv
sra
pop
sfp
lrv
lra
js

quantoViveAncora16BullDog7:
cfp
lra
push -3
lop
add
lw
push 1
beq label6
push 0
b label7
label6:
push -2
lop
add
lw
push 8
beq label10
push 0
b label11
label10:
push 1
label11:
push 1
beq label8
push 1
b label9
label8:
push 8
push -2
lop
add
lw
add
label9:
label7:
srv
sra
pop
sfp
lrv
lra
js
halt