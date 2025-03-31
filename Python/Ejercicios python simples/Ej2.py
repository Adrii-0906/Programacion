'''
Escribir un programa que pregunte el nombre del usuario en la consola y un número
entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces
como el número introducido.
'''

#Hacemos la variable nombre donde vamos a introducir un nombre para que se guarde en la variable.

nombre = input('Dime tu nombre: ')

#Ahora creamos la variale num para que nos diga un numero, este va hacer el numero de veces que se va a imprmir en la pantalla.

num = input('Dime un numero: ')

#Por ultimo imprimimos la variable "nombre" a la cual le sumamos "\n", esto sirve para hacer una salto de linea, y a esto le multplicamos el numero de veces que lo queremos imprimir, es decir, el numero que le hemos puesto en la variable "num".

print((nombre + "\n") * int(num))

