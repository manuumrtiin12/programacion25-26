alturaMaxima = 0
alturaMinima = 0

sumaEdadesArbolesTipoB = 0

arbolesMayores30m = 0

listaAlturas = []
listaDiametros = []
listaTipoMasEdad = []
listaTipo = []

arbolesTipoB = []

print("="*50)
print("[1] Especificar cantidad de arboles a introducir")
print("[2] Caracteristicas de los arboles")
print("[3] Mostrar resumen")
print("[4] Muestra los datos del arbol con mayor altura")
print("[5] Mostrar todos los datos")
print("[6] Salir")
print("="*50)
opcionMenu = int(input("Que quieres hacer?: "))

while opcionMenu != 6:

    if opcionMenu == 1:
        arbolesAñadir = int(input("Cuantos arboles quieres añadir: "))

        if arbolesAñadir <= 0:
            print("Opcion Invalida, intentalo de nuevo: ")
            arbolesAñadir = int(input("Cuantos arboles quieres añadir: "))

    elif opcionMenu == 2 and arbolesAñadir == 0:
        print("Primero debes fijar la cantidad de arboles que quieres añadir: ")
        arbolesAñadir = int(input("Cuantos arboles quieres añadir: "))

        if arbolesAñadir <= 0:
            print("Opcion Invalida, intentalo de nuevo: ")
            arbolesAñadir = int(input("Cuantos arboles quieres añadir: "))

    elif opcionMenu == 2 and arbolesAñadir > 0:
        for i in range(arbolesAñadir):

            diametro = int(input("Cual es el diametro del arbol: "))
            listaDiametros.append(diametro)

            altura = int(input("Cual es la altura del arbol: "))
            listaAlturas.append(altura)

            if altura > 30:
                arbolesMayores30m += 1

            if altura > alturaMaxima:
                alturaMaxima = altura

            elif altura < alturaMinima:
                alturaMinima = altura

            if alturaMinima == 0:
                alturaMinima  = alturaMaxima
            
            tipo = input("Que tipo de arbol es [A/B]: ").upper()
            listaTipoMasEdad.append(tipo)
            listaTipo.append(tipo)

            if tipo == "B":
                arbolesTipoB.append("B")

                edad = int(input("Cual es la edad del arbol: "))
                sumaEdadesArbolesTipoB += edad
                listaTipoMasEdad.append(edad)
            
            print("="*50)

    
    elif opcionMenu == 3:
        print(f"La altura maxima es: {alturaMaxima}")
        print(f"La altura minima es: {alturaMinima}")
        print(f"La media de edad para los de tipo B es {sumaEdadesArbolesTipoB/len(arbolesTipoB)}")
        print(f"Existen {arbolesMayores30m} árboles en total de más de 30 m")

    elif opcionMenu == 4:
        
        posicionArbol = listaAlturas.index(alturaMaxima)
        print(f"El arbol con mayor altura mide: {listaAlturas[posicionArbol]}")
        print(f"Tiene un diametro de {listaDiametros[posicionArbol]}")
        print(f"Es de tipo {listaTipoMasEdad[posicionArbol-1]}")

        if listaTipoMasEdad[posicionArbol-1] == "B":
            print(f"La edad del arbol es {listaTipoMasEdad[posicionArbol+2]}")

    elif opcionMenu == 5:

        contadorArbol = 1
        for i in range(0, len(listaDiametros)):

            print(f"Arbol {contadorArbol}")
            contadorArbol += 1

            print(f"El arbol es de tipo: {listaTipoMasEdad[i]}")
            print(f"El diametro es de: {listaDiametros[i]}")
            print(f"La altura es de: {listaAlturas[i]}")

            if listaTipoMasEdad[i] == "B":
                print(f"La edade del arbol es de: {listaTipoMasEdad[i+1]}")


    else:
        print("Ninguna de las opciones es valida, intentalo de nuevo: ")

    print("="*50)
    print("[1] Especificar cantidad de arboles a introducir")
    print("[2] Caracteristicas de los arboles")
    print("[3] Mostrar resumen")
    print("[4] Muestra los datos del arbol con mayor altura")
    print("[5] Mostrar todos los datos")
    print("[6] Salir")
    print("="*50)
    opcionMenu = int(input("Que quieres hacer?: "))


