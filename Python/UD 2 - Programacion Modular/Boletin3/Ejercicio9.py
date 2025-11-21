import random

def generarNumeros():
    listaNumeros = []
    for i in range(100):
        numero = random.randint(0, 1000)
        listaNumeros.append(numero)
    return listaNumeros


def menu():
    print("=" * 50)
    print("A. Conocer el mayor")
    print("B. Conocer el menor")
    print("C. Obtener la suma de todos los números")
    print("D. Obtener la media")
    print("E. Sustituir el valor de un elemento por otro número")
    print("F. Mostrar todos los números")
    print("G. Salir")
    print("=" * 50)
    eleccion = input("¿Qué quieres hacer?: ").lower()
    return eleccion


def opcionMayor(lista):
    mayor = lista[0]
    for i in range(len(lista)):
        if lista[i] > mayor:
            mayor = lista[i]
    print("El número mayor es:", mayor)


def opcionMenor(lista):
    menor = lista[0]
    for i in range(len(lista)):
        if lista[i] < menor:
            menor = lista[i]
    print("El número menor es:", menor)


def opcionSuma(lista):
    suma = 0
    for i in range(len(lista)):
        suma += lista[i]
    print("La suma total es:", suma)


def opcionMedia(lista):
    suma = 0
    for i in range(len(lista)):
        suma += lista[i]
    media = suma / len(lista)
    print("La media es:", media)


def opcionSustituir(lista):
    print("Hay 100 posiciones (0 a 99)")
    pos = int(input("¿Qué posición quieres cambiar?: "))
    nuevoValor = int(input("¿Qué valor nuevo quieres poner?: "))
    lista[pos] = nuevoValor
    print("Valor cambiado correctamente.")


def opcionMostrar(lista):
    print("Lista completa:")
    print(lista)


def programa():
    lista = generarNumeros()

    salir = False
    while not salir:
        eleccion = menu()

        if eleccion == "a":
            opcionMayor(lista)

        elif eleccion == "b":
            opcionMenor(lista)

        elif eleccion == "c":
            opcionSuma(lista)

        elif eleccion == "d":
            opcionMedia(lista)

        elif eleccion == "e":
            opcionSustituir(lista)

        elif eleccion == "f":
            opcionMostrar(lista)

        elif eleccion == "g":
            print("Saliendo del programa...")
            salir = True

        else:
            print("Opción no válida.")


programa()  