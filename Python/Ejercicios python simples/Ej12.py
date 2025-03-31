'''
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
'''

#Creamos la variable num de tipo entero e introducimos un numero entero positivo.

num = int(input('Dime un numero entero positivo: '))

#Ahora utilizando for vamos hacer que muestre todos los numero impares en un rango de 1 hasta el numero que hemos introducido en la variable. Utilizamos end="," para separar lo numeros por comas.

for i in range(1, num + 1, 2):
        print(i, end=",")