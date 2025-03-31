'''
Escribir un programa que pregunte el nombre del usuario en la consola y después de que el usuario lo introduzca muestre por pantalla el nombre en mayúsculas y el número de caracteres que contiene en líneas distintas.
'''

#Creamos la variable "nombre" a la cual le vamso a guardar un nombre ecrito por pantalla:

nombre = input("Dime tu nombre: ")

#Ahora hacemos un print para imprimir la variable "nombre" escrita en mayusculas, para hacer eso utilizamos upper, y hacemos "nombre.upper" dentro del print, pero sin comillas.

print(nombre.upper())

#Una vez puesto el nombre el mayusculas vamos a hacer el recuento de palabras que contiene la palabra para ellos utilizamos la función len.

print(len(nombre))