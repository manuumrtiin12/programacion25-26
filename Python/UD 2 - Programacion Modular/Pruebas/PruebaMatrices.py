lista1 = [0, 2, 4]
lista2 = [1, 3, 5]
lista3 = [6, 8, 10]

matriz = [lista1, lista2, lista3]

print(matriz[1]) #imprime lista
print(matriz[1] [1]) #imprime posicion de lista

def sumaFila():
    suma = 0

    for i in range(0, len(matriz[1])):
        suma += (matriz[1] [i])

    print(suma)
    return suma

sumaFila()

