'''
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
'''

#Creamos la variable num y le pedimos a la persona que escriba un numero entero positivo.

num = int(input('Dime un numero entero positivo: '))

#Ahora hacemos un for para que separado por comas nos muestre una cuenta atras desde el numero que hemos metido la variable hasta 0.

for i in range(num,-1,-1):
    print(i, end=",")