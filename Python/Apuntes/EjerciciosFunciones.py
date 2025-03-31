#EJERCICIOS FUNCIONES

#Ej1. Define una función que reciba una lista de numeros y retorne una nueva lsita con los nuemeros pares.

def es_par(num):
    return num % 2 == 0

def numeros_pares(lista):
    pares = []
    print('Primer id dentro de la función:', id(pares))
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares

listilla = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
print(numeros_pares(listilla))
print('Segundo id de la función:', id(listilla))

#Ej2. Crea una función que reciba una cadena de texto y cuente cuantas palabras tiene.
def leer_palabras(cadena):
   palabras = cadena.split()
   return len(palabras)

texto = 'jfhsdjhfuaisfhjdksa'
print(leer_palabras(texto))

text2 = input('Introduce un texto: ')
print(leer_palabras(text2))
print(text2)

#Ej3. Escribe una función que utilice *args y **args para aceptar multiples parametros y los imprima como formato.
def imprimir_datos(*arg, **kwargs):
    print(f'Argumentos posicionales: {arg}')
    print(f'Argumentos nombrados: {kwargs}')

imprimir_datos(1, 2, 3, 4, 5, nombre='Adrian', edad='18', direccion='C/Belen', pelo='negro')