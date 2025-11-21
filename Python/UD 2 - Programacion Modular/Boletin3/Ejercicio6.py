def es_numero(texto):
    es_valido = True   # Suponemos que sí es número

    if len(texto) == 0:
        es_valido = False
    else:
        for c in texto:
            if c not in "0123456789":
                es_valido = False

    return es_valido


def cargar_lista():
    lista = []
    sigue = True

    while sigue:
        dato = input("Introduce un número (o algo que no sea número para terminar): ")

        if es_numero(dato):
            lista.append(int(dato))
        else:
            sigue = False

    return lista


def estaOrdenada(lista):
    ordenada = True   

    for i in range(len(lista) - 1):
        if lista[i] > lista[i + 1]:
            ordenada = False

    return ordenada


nums = cargar_lista()
print("Lista introducida:", nums)

if estaOrdenada(nums):
    print("La lista está ordenada de forma ascendente.")
else:
    print("La lista NO está ordenada.")
