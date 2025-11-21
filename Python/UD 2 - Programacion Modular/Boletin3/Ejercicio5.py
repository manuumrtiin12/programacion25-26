def estaOrdenada(lista, ascendente):
    ordenada = True   # Suponemos que sí está ordenada

    if ascendente:
        for i in range(len(lista) - 1):
            if lista[i] > lista[i + 1]:
                ordenada = False
    else:
        for i in range(len(lista) - 1):
            if lista[i] < lista[i + 1]:
                ordenada = False

    return ordenada   # Un único return


def leer_lista():
    lista = []
    cantidad = int(input("¿Cuántos números quieres introducir?: "))
    for n in range(cantidad):
        num = int(input("Introduce un número: "))
        lista.append(num)
    return lista


def todo():
    lista = leer_lista()
    modo = input("¿Quieres comprobar si está ordenada ascendentemente? (s/n): ")

    if modo.lower() == "s":
        ascendente = True
    else:
        ascendente = False

    if estaOrdenada(lista, ascendente):
        if ascendente:
            print("La lista está ordenada ascendentemente.")
        else:
            print("La lista está ordenada descendentemente.")
    else:
        print("La lista NO está ordenada según el criterio elegido.")


todo()
