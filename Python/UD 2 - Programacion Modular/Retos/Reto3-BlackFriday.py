from webbrowser import get


ventas = [
#    Nombre  Unidades  Precio  valoracion
    ["Portátil", 150, 799.99, 4.5],
    ["Smartphone", 250, 599.99, 4.3],
    ["Auriculares", 400, 49.99, 4.0],
    ["Tablet", 120, 299.99, 3.9],
    ["Monitor", 180, 199.99, 4.2],
    ["Smartwatch", 220, 149.99, 4.1],
    ["Teclado mecánico", 300, 89.99, 4.4],
    ["Ratón gaming", 350, 59.99, 4.0],
    ["Cámara digital", 90, 999.99, 4.6],
    ["Consola", 200, 399.99, 4.7]
]

def calculaIngreso(ventas, nombreProducto):
    ingresos = 0
    
    filaProducto = getProducto(ventas, nombreProducto)

    if len(filaProducto) > 0:
        ingresos = filaProducto[1] * filaProducto[2]

    return ingresos

def getProducto(ventas, nombreProducto):
    producto = []

    i = 0

    encontrado = False
    
    while i < len(ventas) and not encontrado:
        if ventas[i][0] == nombreProducto:
            producto = ventas[i]
            encontrado = True

        else:
            i += 1

    return producto

def productoDestacado(ventas, nombreProducto):

    producto = getProducto(ventas, nombreProducto)

    if producto in ventas:
        if producto[3] >= 4.2:

            return True
        
    else:
        return False

def getProductosDestacados(ventas):
    listaProductosDestacados = []

    for fila in ventas:
        es_destacado = productoDestacado(ventas, fila[0])

        if es_destacado:
            listaProductosDestacados.append(fila[0])
    
    return listaProductosDestacados


def tieneMayorIngreso(nombreProducto1, nombreProducto2):
    nombreProducto1 = calculaIngreso(ventas, nombreProducto1)
    nombreProducto2 = calculaIngreso(ventas, nombreProducto2)

    if nombreProducto1 > nombreProducto2:
        return True
    
    else:
        return False

def calculaIngresosTotal(ventas):
    totalGanancias = 0

    for i in range(len(ventas)):
        producto = calculaIngreso(ventas, ventas[i][0])

        totalGanancias += producto
    
    return totalGanancias


resultado1 = calculaIngreso(ventas, "Portátil")
print(resultado1)

resultado2 = getProducto(ventas, "Portátil")
print(resultado2)

resultado3 = productoDestacado(ventas, "tomate")
print(resultado3)

resultado4 = getProductosDestacados(ventas)
print(resultado4)

resultado5 = tieneMayorIngreso("Smartphone", "Portátil")
print(resultado5)
assert tieneMayorIngreso("Smartphone", "Portátil") == True

resultado6 = tieneMayorIngreso("Smartphone", "Portátil")
print(resultado6)
#assert tieneMayorIngreso("Portátil", "Smartphone") == True

assert calculaIngresosTotal(ventas) == 612977.4
resultado7 = calculaIngresosTotal(ventas)
print(resultado7)