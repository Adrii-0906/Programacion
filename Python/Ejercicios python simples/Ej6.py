'''
Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
'''

#Creamos una variable llamada "edad", donde vamos a ingresar una edad.

edad = int(input('Dime tu edad: '))

#Ahora le añadimos una condición, si la edad es mayor o igual a 18 años nos imprima que eres mayor de edad, sino que imprima que eres menor.

if edad >= 18:
    print('Eres mayor de edad')
else:
    print('Eres menor de edad')