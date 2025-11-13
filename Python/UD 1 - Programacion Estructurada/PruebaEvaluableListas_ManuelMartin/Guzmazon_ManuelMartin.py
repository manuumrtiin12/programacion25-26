dineroGastar = float(input("¿Cuanto dinero te quieres gastar?: "))

listaProductos = []
listaPrecioProductos = []

sumaPrecioProductos = 0

sumaTerminar = 0

while dineroGastar > sumaTerminar:

    producto = input("Nombre del producto a introducir: ")
    precio = float(input(f"Cual es el precio de: {producto}: "))

    sumaTerminar = sumaPrecioProductos + precio

    if sumaTerminar < dineroGastar:
        print("=" * 30)
        listaProductos.append(producto)
        listaPrecioProductos.append(precio)
        sumaPrecioProductos += precio
    

print(f"Importe maximo a gastar: {dineroGastar}")
print(f"Productos: {listaProductos}")
print(f"Precios: {listaPrecioProductos}")
print(f"Coste total: {sumaPrecioProductos}")

print("=" * 50)
print("[S] Pulsa S para calcular el diero sobrante")
print("[R] Pulsa R para paliminar un producto y su precio de la lista")
print("[C] Pulsa C para devolver la lista de produtos cuyo precio es mas alto que un importe")
print("=" * 50)
opcionMenu = input("Que quieres hacer?: ").lower()

while opcionMenu == "s" or "r" or "c":
    if opcionMenu == "s":
        print("Sobrante")
        sobrante = dineroGastar - sumaPrecioProductos
        print(f"Dinero a gastar: {dineroGastar} - Precio total de los productos: {sumaPrecioProductos} = {sobrante}")
    
    elif opcionMenu == "r":
        print("Remove")

        nombreProducto = input("Dame el nombre de un producto a eliminar: ")
        print(listaProductos)
        print(listaPrecioProductos)

        if nombreProducto in listaProductos:
            verificacion = input("Estas seguro que quieres eliminar este producto? (S/N): ").lower()

            if verificacion == "s":
                posicion = listaProductos.index(nombreProducto)
                listaProductos.pop(posicion)
                listaPrecioProductos.pop(posicion)

                print(listaProductos)
                print(listaPrecioProductos)
            
            elif verificacion == "n":
                print("Volviendo al menu...")
            
            else:
                print("Opcion no valida...")
                verificacion = input("Estas seguro que quieres eliminar este producto? (S/N): ").lower()

        else:
            print("El producto no esta en la lista...")
            nombreProducto = input("Dame el nombre de un producto a eliminar: ")

    elif opcionMenu == "c":
        print("Productos Caros")

        listaMayor = []
        importe = float(input("Cual seria el importe?: "))

        for i in range(0, len(listaPrecioProductos)):
            if importe < listaPrecioProductos[i]:
                print(listaProductos[i]) #Esto es para que se vean los nombres de los productos 
                listaMayor.append(listaPrecioProductos[i])
            
        print(f"Los precios mayores al importe son: {listaMayor}")

    print("=" * 50)
    print("[S] Pulsa S para calcular el diero sobrante")
    print("[R] Pulsa R para paliminar un producto y su precio de la lista")
    print("[C] Pulsa C para devolver la lista de produtos cuyo precio es mas alto que un importe")
    print("=" * 50)
    opcionMenu = input("Que quieres hacer?: ").lower()
        


