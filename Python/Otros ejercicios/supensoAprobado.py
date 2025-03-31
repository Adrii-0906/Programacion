# Segun tu nota del 0-10 vamos a ver q nota tienes por escrita

a = int(input('Dime tu nota en clase: '))

if a < 5:
    print('SUSPENSO')
elif a >= 5 and a < 6:
    print('SUFICIENTE')
elif a >= 6 and a < 7:
    print('BIEN')
elif a >= 7 and a < 9:
    print('NOTABLE')
elif a >= 9 and a < 10:
    print('SOBRESALIENTE')
elif a == 10:
    print('MATRICULA DE HONOR')
else:
    print('Dato no valido')