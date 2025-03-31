import listas_util
import ordenar
import diccionarios

def main():
    lista_numeros = listas_util.aleatorio()
    print(lista_numeros)
    maximo = listas_util.encontrar_maximo(lista_numeros)
    minimo = listas_util.encontrar_minimo(lista_numeros)
    print(f'El numero maximo es {maximo}')
    print(f'El numero minimo es {minimo}')
    ordenado = ordenar.ordenar(lista_numeros)
    print(ordenado)
    contador = diccionarios.ocurrencia(lista_numeros)
    print(contador)

main()