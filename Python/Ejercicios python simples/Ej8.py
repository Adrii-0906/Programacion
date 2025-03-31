'''
Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
'''

#Ahora vamos crear 2 variables donde una va hacer el divisor y la otra dividendo. Esta variable es de tipo float porque podemos introducir numeros decimales.

while True:
    try:
        num1 = int(input('Dime un num: '))
        num2 = int(input('Dime un num: '))
        break
        
