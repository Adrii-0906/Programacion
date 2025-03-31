num = int(input('Dime un numero: '))

while num != 0:
    num = int(input('Dime otro numero: '))
if num == -num:
    print(sum(num))
else:
    print('No hay numero negativos')