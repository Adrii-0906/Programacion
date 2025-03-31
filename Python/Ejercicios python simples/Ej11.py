'''
Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
'''

#Creamos la variabel edad, donde vamos a introducir un numero entero.

edad = int(input('Dime tu edad: '))

#Ahora con un for vamos hacer que nos muestre el rango desde 1 hasta su edad, y lo vamos a imprimir.

for i in range(1, edad+1):
    print(i)