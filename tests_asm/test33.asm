push 0
push Area
lhp
sw
push 1
lhp
add
shp
push 2
lhp
sw
push 1
lhp
add
shp
lhp
push Rectangle
lhp
sw
push 1
lhp
add
shp
push 2
lhp
sw
push 1
lhp
add
shp
lhp
push -2
lfp
add
lw
sop
lfp
lfp
push 0
smo
lop
push -2
add
lw
js
push -3
lfp
add
lw
sop
lfp
lfp
push 0
smo
lop
push -2
add
lw
js
add
print
halt

s1Area4:
cfp
lra
push 1
srv
sra
pop
sfp
lrv
lra
js

Area:
lmo
push 0
beq s1Area4

t1Rectangle9:
cfp
lra
push 2
srv
sra
pop
sfp
lrv
lra
js

Rectangle:
lmo
push 0
beq t1Rectangle9
halt
