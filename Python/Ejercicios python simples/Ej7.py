'''
Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
'''

#Ahora vamos crear 2 variables donde una va hacer el divisor y la otra dividendo. Esta variable es de tipo float porque podemos introducir numeros decimales.

num1 = float(input('Dime un numero: '))
num2 = float(input('Dime otro numero: '))

#Ahora hacemos la condición de que si num2 es igual a 0 imprimimamos que ha habido un error. Sino imprimimos el resultado de la operación.

if num2 == 0:
    print('¡Ha habido un error!')
else:
    print(num1 / num2, 'Este es el resultado')