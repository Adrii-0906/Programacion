print('Vamos a calcular el precio de una prenda de ropa!')

tarifa = float(input('Dime el precio de la prenda de ropa:'))
descuento = float(input('Dime el descuento q se va a relaizar:'))
precioFinal = tarifa - (tarifa * descuento / 100)

print('El precio final es: ', precioFinal)