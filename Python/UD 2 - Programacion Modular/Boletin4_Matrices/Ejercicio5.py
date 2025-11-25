matriz = [[8, 1, 6],[3, 5, 7],[4, 9, 2, 0]]


def NumerosPares(matriz):
    numeros =[ ]

    for fila in matriz:
        for numero in fila:
            if numero % 2 == 0:
                numeros.append(numero)
            
            elif numero == 0:
                numeros.append(numero)

    print(numeros)

NumerosPares(matriz)
