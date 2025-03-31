ingredientes_disponibles = ['Tomate','Queso', 'Nata', 'Cebolla', 'Pollo','Huevo','Salami','Anchoa','Bacon','Gamba']

def inicializar():
    pizzeria ={
        'numero_pedidos': 0,
        'codigo_pedido': 1,
        'lista_pedido': []
    }
    return pizzeria

def agregar_pedido(pizzeria):
    nombre = input('Introduce el nombre del ciente: ')
    telefono = input('Introduce el telefono del ciente: ')
    print('Seleccione los ingredientes')

    cont = 0
    for i in ingredientes_disponibles:
        print(f'{cont}: {i}')
        cont += 1

    ingredientes = []

    while len(ingredientes) < 10:
        try:
            seleccion = int(input('Seleccione el num ingr (0-9) y -1 para finalizar: '))

            if seleccion == -1:
                break
            if seleccion < 0 or seleccion > 9:
                print('El numero no valido')
            elif ingredientes_disponibles[seleccion] in ingredientes:
                print('El ingrediente ya existe. Elige otro')
            else:
                ingredientes.append(ingredientes_disponibles[seleccion])
        except ValueError:
            print('El numero no valido. Ingrese otro numero')

    nuevo_pedido = {
        'nombre': nombre,
        'telefono': telefono,
        'codigo_pedido': pizzeria['codigo_pedido'],
        'numero_ingredientes': len(ingredientes),
        'ingredientes': ingredientes
    }

    #Agregar pedido a la lista
    pizzeria['lista_pedido'].append(nuevo_pedido)
    pizzeria['numero_pedidos'] += 1
    pizzeria['codigo_pedido'] += 1

    print(f' El pedido de {nombre} ha sido agregado con exito')

    return pizzeria

def eliminar_pedido(pizzeria):
    codigo = int(input('Seleccione el codigo del pedido que quieres eliminar: '))

    for pedido in pizzeria['lista_pedido']:
        if pedido['codigo_pedido'] == codigo:
            pizzeria['lista_pedido'].remove(pedido)
            pizzeria['codigo_pedido'] -= 1
            print(f'El pedido con {codigo} ha sido eliminado con exito')
            return pizzeria
    print(f'No se ha encotrado el {codigo} en el pedido')
    return pizzeria

def mostrar_pedidos(pizzeria):
    nombre = input('Introduce el nombre del ciente que quieres buscar: ')
    for pedido in pizzeria['lista_pedido']:
        if pedido['nombre'] == nombre:
            print(f'Pedido encontrado {pedido}')
    print(f'No se encontro un pedido con el nombre {nombre}')



def mostrar_pedido(pizzeria):
    if not pizzeria['numero_pedidos']:
        print('Pedido no encontrado')
    else:
        for pedido in pizzeria['lista_pedidos']:
            for ingrediente in pedido['ingredientes']:
                print(f'{pedido}')





pizzeria = inicializar()
agregar_pedido(pizzeria)
agregar_pedido(pizzeria)
eliminar_pedido(pizzeria)
print(pizzeria)
