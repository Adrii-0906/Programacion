def ejercicio5():
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


def ejercicio6():
    lista_nombre = []
    iteracion = 1
    while True:
        nombre = input(f'Ingresa el nombre{iteracion} o la palabra <end> para terminar: ')
        if nombre == 'end':
            break
        lista_nombre.append(nombre)
        iteracion += 1

    buscar = input('Ingresa el nombre que quieras buscar: ')
    if buscar in lista_nombre:
        print(f'{buscar} esta en la lista {lista_nombre.index(buscar)}')
    else:
        print(f'{buscar} no esta en la lista')
ejercicio6()
