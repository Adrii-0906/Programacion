num = int(input('Dime un numero: '))

if num < 10:
    print('La tabla de multiplicar de', num)
    for i in range (1, 11):
        resultado = num * i
        print(num, '*', i, '=', resultado)
else:
    print('Dime un numero valido')
    