matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
    ]


def calculaListaMaximos(matriz):
    mayores = []  

    for fila in matriz:
        mayor = calculaMaximo(fila)
        mayores.append(mayor)

    return mayores

def calculaMaximo(listaNum):
    mayor = listaNum[0]

    for numero in listaNum:
        if numero > mayor:
            mayor = numero

    return mayor


def getMaximPorFila(numFila, matriz):
    listaMaximos = calculaListaMaximos(matriz)

    return listaMaximos[numFila]


def maxColumna(matriz, col):
    maximo = matriz[0][col]  

    for fila in matriz:
        if fila[col] > maximo:
            maximo = fila[col]

    return maximo

def maxTotal(mayores):
    numMayor = 0

    for i in mayores:
        if i > numMayor:
            numMayor = i

    return numMayor


mayores = calculaListaMaximos(matriz)
resultado = maxTotal(mayores)
print(resultado)