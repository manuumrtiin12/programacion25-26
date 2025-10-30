from inspect import indentsize
from operator import index


print("="* 30)
print("[R] Registrar Juego")
print("[E] Mostrar Estadisticas")
print("[P] Juego con mayor puntuación")
print("[D] Detalle de un juego")
print("[G] Mostrar juegos de un género")
print("[S] Salir del Programa")
print("="* 30)

eleccion = input("Selecciona [|R / E / P / D / G / S|]: ")

listaNombres = ["Mario", "Fifa", "Skyrim"]
listaPuntuacion = [1, 2, 3]
listaGeneros = ["Aventura", "Deporte", "Aventura"]

while eleccion != "S":

    if eleccion == "R":
        nombre = input("Dame el nombre del juego: ")
        listaNombres.append(nombre)

        punctuation = int(input("Dame la puntuacion: "))
        listaPuntuacion.append(punctuation)

        genero = input("Dame el genero del juego: ")
        listaGeneros.append(genero)

    elif eleccion == "E":
        print("Tu coleccion de Juegos: ")

        for i in range(0, len(listaNombres)):
            print(f"Nombre: {listaNombres[i]} | Puntuacion: {listaPuntuacion[i]} | Genero: {listaGeneros[i]}")

    elif eleccion == "P":
        mayor = listaPuntuacion[0]

        for i in listaPuntuacion:
            if i > mayor:
                mayor = i

        posicion = listaPuntuacion.index(mayor)
        
        print(f"Nombre: {listaNombres[posicion]} |  Puntuacion: {listaPuntuacion[posicion]} | Genero: {listaGeneros[posicion]}")

    elif eleccion == "D":
        nombreJuego = input("Dame el nombre de un Juego: ")

        if nombre in listaNombres:
            posicionNombre = listaNombres.index(nombreJuego)
            print(f"Nombre: {listaNombres[posicionNombre]} |  Puntuacion: {listaPuntuacion[posicionNombre]} | Genero: {listaGeneros[posicionNombre]}")
        
        else:
            print("Juego no encontrado, intentalo de nuevo...")
            nombreJuego = input("Dame el nombre de un Juego: ")

    elif eleccion == "G":
        buscarGenero = input("Dame el nombre de un Genero: ")
        listaPosicionGenero = []
        
        if buscarGenero in listaGeneros:
            for i in range(0, len(listaGeneros)):
                if  listaGeneros[i]  == buscarGenero:
                    listaPosicionGenero.append(listaNombres[i])
        
        else:
            print("Genero no encontrado...")
            buscarGenero = input("Dame el nombre de un Genero: ")

        print(listaPosicionGenero)

    print("="* 30)
    print("[R] Registrar Juego")
    print("[E] Mostrar Estadisticas")
    print("[S] Salir del Programa")
    print("[P] Juego con mayor puntuación")
    print("[D] Detalle de un juego")
    print("[G] Mostrar juegos de un género")
    print("[S] Salir del Programa")
    print("="* 30)
    eleccion = input("Selecciona R, E o S: ")

    

print("Terminado...")
