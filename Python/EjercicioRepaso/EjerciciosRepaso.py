from logging import exception
from multiprocessing.managers import Value


#Ejercicios de repaso: listas, tuplas, diccionarios y estructuras de control en Python.


#1. Ejercicio: Crear una lista de nombres
#Crea un programa que pida al usuario que ingrese cinco nombres, uno por uno, y los guarde en una lista. Al final, el programa debe imprimir todos los nombres ingresados.
def ejercicio1():
    def imprimir_lista(**datos):
        lista = []
        for clave, valor in datos.items():
            lista.append(valor)
        return list(lista)

    a = input('Dime un nombre: ')
    b = input('Dime un nombre: ')
    c = input('Dime un nombre: ')
    d = input('Dime un nombre: ')
    e = input('Dime un nombre: ')

    print(imprimir_lista(a=a, b=b, c=c, d=d, e=e))

#ejercicio1()

#2. Ejercicio: Validación de números enteros
#Crea un programa que solicite al usuario un número entero positivo. Si el número no es válido (por ejemplo, si es negativo o no es un número), el programa debe pedir que se ingrese de nuevo hasta que se ingrese un valor correcto.
def ejercicio2():
    def numero_positivo():
        while True:
            try:
                a = int(input('Dime un numero: '))
                if a >= 0:
                    print(f'El numero {a} es positivo')
                else:
                     print('El numero debe ser positivo')
            except ValueError:
                print('El numer ingrasado no es correcto. Por favor ingresa el numero correcto')
    numero_positivo()
#ejercicio2()

#Ejercicio 3
#Escribe un programa que reciba una lista de palabras y cuente cuántas veces aparece cada palabra. Imprime los resultados.
#def ejercicio3():
    lista = ['hola', 'hola', 'hola','adios','adios','adios','adios','adios',5,5,5,5,6,6,6,6,7,7,7,8]
    #def contador_palabras():


#ejercicio3()
