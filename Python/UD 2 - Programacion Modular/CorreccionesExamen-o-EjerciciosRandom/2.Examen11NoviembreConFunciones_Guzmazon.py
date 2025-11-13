def cargaCesta(dineroMax):
    productos = []
    precios = []
    costeTotal = 0

    while dineroMax > costeTotal:

        producto = input("Nombre del producto a introducir: ")
        precio = float(input(f"Cual es el precio de: {producto}: "))

        sumaTerminar = costeTotal + precio

        if sumaTerminar < dineroMax:
            print("=" * 30)
            
            productos.append(producto)
            precios.append(precio)
            costeTotal += precio
        

    print(f"Importe maximo a gastar: {dineroMax}") 
    print(f"Productos: {producto}")
    print(f"Precios: {precios}")
    print(f"Coste total: {costeTotal}")

    return productos, precios, costeTotal

importeGastar = float(input("Cuanto te quieres gastar: "))

resultados = cargaCesta(importeGastar)
productos = resultados[0]
precios = resultados[1]
costeTotal = resultados[2]