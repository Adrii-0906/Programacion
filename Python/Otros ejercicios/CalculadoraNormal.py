num1 = float(input('Dime el primer número de la operación: '))

operador = str(input('Dime que operador quieres utilizar: '))

num2 = float(input('Dime el siguiente número de la opreción: '))

if operador == '+':
    print(num1 + num2)
elif operador == '-':
    print(num1 - num2)
elif operador == '*':
    print(num1 * num2)
elif operador == '/':
    print(num1 / num2)
else:
    print('No se puede realizar la operación')