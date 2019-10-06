x = input().split(' ')
a = int(x[0])
b = int(x[1])
cont = 1
while b < 1:
    if b < 1:
        b = int(x[1+cont])
        cont+=1
    if b > 0:
        break
soma = 0
vb = b
var = 0
while True:
    if vb > 0:
        soma += a + var
        var+=1
        vb-=1
    if vb==0:
        break
print(soma)
