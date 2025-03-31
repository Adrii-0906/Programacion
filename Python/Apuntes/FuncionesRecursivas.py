#FUNCIONES RECURSIVAS
#Son funciones que se llaman a si misma. Son utililes cuando se un problema puede descomponerse es subproblemas mas pequenos de la misma natiraleza
from six import print_


def factorial_recursivo(n):
    if n==0 or n==1:
        return 1
    else:
        return n * factorial_recursivo(n-1)
print(factorial_recursivo(5))

def fibonacci_recursivo(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibonacci_recursivo(n-1)+fibonacci_recursivo(n-2)

print(fibonacci_recursivo(7))

#Dibujar un triangulo de asteriscos con altura N.
#El ejercicio solicita leer un numero entero N del teclado para dibujar un triangulo de asteriscos
#Se deben definir al menos 3 subprogramas.
#Ejemplo de Output: Triangulo de altura 4
# +
# +++
# +++++
# +++++++

def dibujar_fila(n):
    print('*' * n)
def dibujar_triangulo(n):
    for i in range(1, n+1):
        dibujar_fila(2*i-1)
def main():
    n = int(input('Dime la altura del triangulo: '))
    dibujar_triangulo(n)
main()

#Ejercicio que solicita leer dos numeros enteros de teclado y sumar toss los numeros pares en el intervalo. Tambien se debe definir un procedimiento para la lectura correcta del intervalo y una funcios para calcular la suma
def leer_intervalo():
    a = int(input('Dame el numero de inicio: '))
    b = int(input('Dame el numero de fin: '))
    while (a<=b):
        print('El primer numero debe ser menor que le segundo numero')
        a = int(input('Dame el numero de inicio: '))
        b = int(input('Dame el numero de fin: '))
    return a, b
def suma_pares(a,b):
    suma = 0
    for i in range(a,b+1):
        if i % 2 == 0:
            suma += i
    return suma
def main1():
    n1, n2 = leer_intervalo()
    resultado = suma_pares(n1,n2)
    print(f'El resultado es {resultado}')

main1()