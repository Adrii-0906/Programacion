#Metodos utiles para trabajar con listas

#1. append(item). Añade un elemento al final de la lista
frutas = ['Pera', 'mazana']
frutas.append('fresa')
print(frutas)

#2. extend(item)Añade todos lo elementos de un iterable (puede ser una lista) al final de la lista.
frutas = ['manzana', 'tomate']
frutas.extend(['naranja', 'kiwi'])
print('extend():', frutas)

#3. insert(item). Inserta un elemento en la lista en la posisicion que indica el indice.
frutas = ['manzana', 'tomate']
frutas.insert(1, 'banana')
print('insert([]):', frutas)

#4. romove(item). Elimina el primer elemento especificado de la lista, si no existe, genera un error.
frutas = ['manzana', 'tomate']
frutas.remove('manzana')
print('remove():',frutas)

#5. pop(item) Elimina y devuelve el elemento en la posicion especificada por el índice. Si no se especifica un índice, elimina y devuelve el último elemento de la lista.abs
frutas = ['manzana', 'tomate']
fruit = frutas.pop(0)#Elmina y delvuelve el último elemento
print(fruit)
print('pop():', frutas)
#6. index(). Devuelve el índice de la PRIMERA aparición del elemento especificado. Si no lo encuentra, genera un error.
frutas = ['manzana', 'tomate']
indice = frutas.index('tomate')
print('index():', indice)

#7. count(item). Devuelve el numero de veces que aparece un elemento en la lista.
frutas = ['manzana', 'banana', 'tomate', 'banana']
cantidad = frutas.count('banana')
print('count():',cantidad)

#8. sort(key=None), reverse=False. Ordena los elementos de la lista en su lugar, modificando unq funcion key para personalizar el orden y un parametro reverse para ordenar en orden descendente.
frutas = ['manzana', 'banana', 'tomate']
frutas.sort()
print(frutas)

#9 reverse(). Invierte el orden de los elementos de la lista.
frutas = ['manzana', 'banana', 'tomate']
frutas.reverse()
print(frutas)

#10. clear(). Elimina todos los elementos de la lista dejandola vacia.
frutas = ['manzana', 'banana', 'tomate', 'banana']
frutas.clear()
print(frutas)