def estaOrdenadaAscendemente(lista):
    for i in range(len(lista) - 1):
        if lista[i] > lista[i + 1]:
            return False
    return True

def leer_lista():
    lista = []
    cantidad = int(input("¿Cuántos números quieres introducir?: "))
    for n in range(cantidad):
        num = int(input("Introduce un número: "))
        lista.append(num)
    return lista

def todo():
    lista = leer_lista()
    if estaOrdenadaAscendemente(lista):
        print("La lista está ordenada ascendentemente.")
    else:
        print("La lista NO está ordenada ascendentemente.")

todo()
