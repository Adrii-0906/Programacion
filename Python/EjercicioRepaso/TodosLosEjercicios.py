import utilidades1
import filtrados
import listasUtil
import diccionarios_util
import texto_util
import listas_util
import ordenar
import diccionario
def ejercicios_basicos():
    def ejercicio_basico1():
        #Ejercicio1.
        nombre = str(input('Ingrese su nombre: '))
        print(f'Ahora estas en la matrix, {nombre}')

    def ejercicio_basico2():
        #Ejercicio2.
        n1 = float(input('Ingrese un numero: '))
        n2 = int(input('Ingrese un numero: '))
        res = n1 + n2
        print(f'El resultado es {res}')

    def ejercicio_basico3():
        #Ejercicio3
        n1 = float(input('Ingrese un numero: '))
        n2 = float(input('Ingrese un numero: '))
        res = n1 + n2
        print(f'El resultado es {res}')
        n3 = float(input('Ingrese un numero: '))
        mult = res * n3
        print(f'El resultado es {mult}')

    def ejercicio_basico4():
        #Ejercicio4.
        km = int(input('Ingrese una cantodad de Km: '))
        cantidad = float(input('Ingrese una cantidad: '))
        consumo = km/cantidad
        print(f'El resultado es {consumo}')

    def ejercicio_basico5():
        f =float(input('Ingrese una temperatura: '))
        c = (5/9)*(f-32)
        print(f'El resultado es {c}')

    def ejercicio_basico6():
        a = float(input('Ingrese un numero: '))
        b = float(input('Ingrese un numero: '))
        c = float(input('Ingrese un numero: '))
        print(f'El promedio es es {(a+b+c)/3}')

    def ejercicio_basico7():
        a = float(input('Ingrese un numero: '))
        b = a*15 / 100
        print(f'Si descontamos el 15% queda {a-b}')

    print('Este es el primer menu')
    print('Hay 7 ejercicios, para ejecutar los ejecicios pon el numero de cada ejercicios (Ej. Ejercicio 1 = 1)')
    print('Para salir pulsa 0')
    while True:
        menu1 = input('Dime el numero del ejercicio (1-14) y (0) para salir: ')
        if menu1 == '1':
            ejercicio_basico1()
        elif menu1 == '2':
            ejercicio_basico2()
        elif menu1 == '3':
            ejercicio_basico3()
        elif menu1 == '4':
            ejercicio_basico4()
        elif menu1 == '5':
            ejercicio_basico5()
        elif menu1 == '6':
            ejercicio_basico6()
        elif menu1 == '7':
            ejercicio_basico7()
        elif menu1 == '0':
            print('Salir')
            break

def ejercicios_estructura_de_control():
    def ejercicio_estructura1():
        #Ejercicio1.
        a = int(input('Ingrese un numero: '))
        if a > 0:
            print(f'{a} es positivo')
        elif a < 0:
            print(f'{a} es negativo')
        else:
            print(f'{a} es neutro')

    def ejercicio_estructura2():
        #Ejercicio2.
        a = int(input('Ingrese un numero: '))
        if a % 2 == 0:
            print(f'{a} es par')
        else:
            print(f'{a} es impar')

    def ejercicio_estructura3():
        #Ejercicio3.
        total = 0
        while total < 10:
            total += 1
            print(total, end=' ')

    def ejercicio_estructura4():
        #Ejercicio4.
        total = 0
        for i in range(1, 100+1):
            total = i + total
            print(total, end=' ')

    def ejercicio_estructura5():
        #Ejercicio5.
        a = input('Ingrese una letra: ')
        if a == 'a':
            print(f'{a} es vocal')
        elif a=='e':
            print(f'{a} es vocal')
        elif a=='i':
            print(f'{a} es vocal')
        elif a=='o':
            print(f'{a} es vocal')
        elif a=='u':
            print(f'{a} es vocal')
        else:
            print(f'{a} no es vocal')

    def ejercicio_estructura6():
        #Ejercicio6.
        a = int(input('Ingrese un numero(1, 10): '))
        for i in range(1, 10+1):
            res = a * i
            print(f'{a} * {i} = {res}')

    def ejercicio_estructura7():
        #Ejercicio7.
        contador = 0
        while True:
            a = int(input('Ingrese un numero(0 para finalizar el programa): '))
            if a == 0:
                break
            if a < 0:
                contador += 1
        print(f'Los nuemero negativos introdicidos son: {contador}')

    def ejercicio_estructura8():
        #Ejercicio8.
        def es_impar(num):
            if num % 2 != 0:
                return num
        inicial = int(input('Ingrese un numero: '))
        final = int(input('Ingrese un numero: '))
        for i in range(inicial, final+1):
            if es_impar(i):
                print(i, end=' ')

    def ejercicio_estructura9():
        #Ejercicio9.
        a = 'Hola'
        while True:
            b = str(input('Ingrese una contraseña: '))
            if b == 'Hola':
                break
        print('La contraseña es correcta')

    def ejercicio_estructura10():
        #Ejercicio10.
        a = int(input('Ingrese un numero: '))
        fac = 1
        for i in range(1, a+1):
            fac = fac * i
            print(fac, end=' ')

    def ejercicio_estructura11():
        #Ejercicio11.
        def es_primo(num):
            if num <= 1:
                return False
            for i in range(2, int(num ** 0.5) + 1):
                if num % i == 0:
                    return False
            return True
        inicial = int(input('Ingrese el numero inicial: '))
        final = int(input('Ingrese el numero final: '))
        for i in range(inicial, final+1):
            if es_primo(i):
                print(i, end=' ')

    def ejercicio_estructura12():
        #Ejercicio12.
        def suma(num):
            sumar = 0
            for i in str(num):
                sumar += int(i)
            return sumar
        a = int(input('Ingrese un numero: '))
        res = suma(a)
        print(f'El resultado es {res}')

    def ejercicio_estructura13():
        #Ejercicio13.
        import random
        aleatorio = random.randint(1, 100)
        while True:
            a = int(input('Ingrese un numero: '))
            if a == aleatorio:
                break
            elif a > aleatorio:
                print('El numero que has dicho es mayor que el numero aleatorio')
            elif a < aleatorio:
                print('El numero que has dicho es menor que el numero aleatorio')
        print(f'{a} es igual a {aleatorio}')

    def ejercicio_estructura14():
        #Ejercicio14.
        def fibonacci(n):
            fib = []
            a, b = 0, 1
            for i in range(n):
                fib.append(a)
                a, b = b, a + b
            return fib
        try:
            n = int(input('Ingrese un numero: '))
            if n < 0:
                print('Introduce otro numero entero que no sea negativo')
            else:
                print(fibonacci(n))
        except ValueError:
            print('Introduce datos validos')

    def ejercicio_estructura15():
        #Ejercicio15.
        def imprimir_triangulo(n):
            for i in range(1, n + 1):
                linea = [str(j) for j in range(1, i + 1)]
                print(" ".join(linea))
        n = int(input("Introduce un número entero N: "))
        imprimir_triangulo(n)

    print('Este es el tecer menu')
    print('Hay 9 ejercicios, para ejecutar los ejecicios pon el numero de cada ejercicios (Ej. Ejercicio 1 = 1)')
    print('Para salir pulsa 0')
    while True:
        menu2 = input('Dime el numero del ejercicio (1-15) y (0) para salir: ')
        if menu2 == '1':
            ejercicio_estructura1()
        elif menu2 == '2':
            ejercicio_estructura2()
        elif menu2 == '3':
            ejercicio_estructura3()
        elif menu2 == '4':
            ejercicio_estructura4()
        elif menu2 == '5':
            ejercicio_estructura5()
        elif menu2 == '6':
            ejercicio_estructura6()
        elif menu2 == '7':
            ejercicio_estructura7()
        elif menu2 == '8':
            ejercicio_estructura8()
        elif menu2 == '9':
            ejercicio_estructura9()
        elif menu2 == '10':
            ejercicio_estructura10()
        elif menu2 == '11':
            ejercicio_estructura11()
        elif menu2 == '12':
            ejercicio_estructura12()
        elif menu2 == '13':
            ejercicio_estructura13()
        elif menu2 == '14':
            ejercicio_estructura14()
        elif menu2 == '15':
            ejercicio_estructura15()
        elif menu2 == '0':
            print('Salir')
            break

def ejercicios_listas_tuplas_diccionarios():
    def ejercicio1():
        #Ejercicio1
        lista_ordenada = utilidades1.ordenar_lista()
        print(lista_ordenada)

    def ejercicio2():
        #Ejercicio2
        numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]
        filtrado_numeros =filtrados.filtrado(numeros)
        print(filtrado_numeros)

    def ejercicio3():
        #Ejercicio3
        numeros = [1,3,4,3,3,2,3,4,5,5,6,7,56,3,2,2]
        duplicados = listasUtil.eliminar_duplicados(numeros)
        print(duplicados)

    def ejercicio4():
        #Ejercicio4
        #Desempaquetar tupla
        tupla = [10,20,30]
        a, b, c = list(tupla)
        print(a, b, c)

    def ejercicio7():
        #Ejercicio7
        claves = ['nombre', 'edad']
        valores = ['Adrian', 18]
        diccionario_creado = diccionarios_util.crear_diccionario(claves, valores)
        print(diccionario_creado)

    def ejercicio8():
        # Ejercicio8.
        cadena = input('Ingrese una texto: ')
        conteo = texto_util.contar_palabra(cadena)
        print(conteo)


    def ejercicio9():
        diccionario = {'1': 'a', '2': 'b', '3': 'c', '4': 'd', '5': 'e'}
        invertido = diccionarios_util.diccionarios_invertidos(diccionario)
        print(invertido)

    print('Este es el segundo menu')
    print('Hay 9 ejercicios, para ejecutar los ejecicios pon el numero de cada ejercicios (Ej. Ejercicio 1 = 1)')
    print('Para salir pulsa 0')
    while True:
        menu3 = input('Dime el numero del ejercicio (1-9) y (0) para salir: ')
        if menu3 == '1':
            ejercicio1()
        elif menu3 == '2':
            ejercicio2()
        elif menu3 == '3':
            ejercicio3()
        elif menu3 == '4':
            ejercicio4()
        elif menu3 == '5':
            ejercicio7()
        elif menu3 == '6':
            ejercicio8()
        elif menu3 == '7':
            ejercicio9()
        elif menu3 == '0':
            print('Salir')
            break

def ejercicios_repaso():
    def ejercicio_repaso1():
        #Ejercicio1.
        lista = []
        for i in range(5):
            nombres = input('Ingrese nombres: ')
            lista.append(nombres)
        print(lista)

    def ejercicio_repaso2():
        #Ejercicio2.
        while True:
            numero = input('Ingrese un numero entero positivo: ')
            try:
                if int(numero) < 0:
                    print(f'{numero} es un numero entero negativo')
                elif int(numero) > 0:
                    print(f'{numero} es un numero entero positivo')
                    break
            except ValueError:
                print('Introduce datos validos')

    def ejercicio_repaso3():
        #Ejercicio3.
        lista = ["manzana", "banana", "manzana", "naranja", "banana", "manzana"]
        def conteo(lista):
            contar_palabras = {}

            for palabra in lista:
                if palabra in contar_palabras:
                    contar_palabras[palabra] += 1
                else:
                    contar_palabras[palabra] = 1

            return contar_palabras
        resultado = conteo(lista)

    # Imprimir resultados
        for palabra, cantidad in resultado.items():
            print(f"{palabra}: {cantidad}")

    def ejercicio_repaso4():
        #Ejercicio4
        def ingresar_notas():
            notas = {}
            for i in range(5):
                usuario = input(f'Ingrese un usuario {i + 1}: ')
                nota = float(input('Ingrese la nota: '))
                notas[usuario] = nota
            return notas
        notas = ingresar_notas()
        print(notas)
        promedio = sum(notas.values()) / len(notas)
        print(f'El promedio de las notas: {promedio}')

    def ejercicio_repaso5():
        #Ejercicio5.
        listaIngredientes = ['Tomate', 'Queso', 'Pollo', 'Bacon', 'Piña', 'Jamon', 'York', 'Mozzarella']
        print(listaIngredientes)

        def listaUsuario():
            listaUsuario = []
            while True:
                usuario = input('Ingrediente: ')
                if usuario in listaIngredientes:
                    listaUsuario.append(usuario)
                    if len(listaUsuario) >= 5:
                        break
                else:
                    print('El ingrediente no esta en la lista')
            return listaUsuario

        print(listaUsuario())

    def ejercicio_repaso6():
        #Ejercicio6.
        lista_personas =[]
        iteracion = 1
        while True:
            personas = input('Dime el nombre de personas. Cuando termines escribe <end> para finalizar: ')
            if personas == 'end':
                break
            lista_personas.append(personas)
            iteracion += 1

        buscar = input('Ingrese el nombre de una de las personas para buscarla en la lista: ')
        if buscar in lista_personas:
            print(f'{buscar} se enuentra en la lista {lista_personas.index(buscar)}')
        else:
            print(f'{buscar} no se encuentra en la lista')

    print('Este es el cuarto menu')
    print('Hay 6 ejercicios, para ejecutar los ejecicios pon el numero de cada ejercicios (Ej. Ejercicio 1 = 1)')
    print('Para salir pulsa 0')
    while True:
        menu4 = input('Dime el numero del ejercicio (1-6) y (0) para salir: ')
        if menu4 == '1':
            ejercicio_repaso1()
        elif menu4 == '2':
            ejercicio_repaso2()
        elif menu4 == '3':
            ejercicio_repaso3()
        elif menu4 == '4':
            ejercicio_repaso4()
        elif menu4 == '5':
            ejercicio_repaso5()
        elif menu4 == '6':
            ejercicio_repaso6()
        elif menu4 == '0':
            print('Salir')
            break

def MiniProyecto():
    def main():
        lista_numeros = listas_util.aleatorio()
        print(lista_numeros)
        maximo = listas_util.encotrar_maximo(lista_numeros)
        minimo = listas_util.encotrar_minimo(lista_numeros)
        print(f'Maximo: {maximo}')
        print(f'Minimo: {minimo}')
        lista_ordenada = ordenar.ordenar(lista_numeros)
        print(lista_ordenada)
        contar_numeros = diccionario.contar(lista_numeros)
        print(contar_numeros)

        print('Este es el menu de un Mini Proyecto')
        print('Para que se realice las opreaciones pulse 1')
        print('Para salir pulse 0')
    while True:
        menu5 = input('Ingrese el numero 1: ')
        if menu5 == '1':
            main()
        elif menu5 == '0':
            print('Saliendo')

def menu():
    print('Dime que menu de ejercicios quiere que se ejecute')
    print('Para ejecutar el primer pulsa 1')
    print('Para ejecutar el segundo pulsa 2')
    print('Para ejecutar el tercero pulsa 3')
    print('Para ejecutar el cuarto pulsa 4')
    print('Para ejecutar el MiniProyecto pulsa 5')
    print('Para salir ezcribe <exit>')
    menu = input('Ingrese la opcion: ')
    if menu == '1':
        ejercicios_basicos()
    elif menu == '2':
        ejercicios_estructura_de_control()
    elif menu == '3':
        ejercicios_listas_tuplas_diccionarios()
    elif menu == '4':
        ejercicios_repaso()
    elif menu == '5':
        MiniProyecto()
    elif menu == 'exit':
        print('Saliendo')

menu()