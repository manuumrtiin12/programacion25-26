matriz = [
    [8, 1, 7],
    [3, 5, 7],
    [4, 9, 4]
    ]

def getDiagonalFacil(matriz):
    diagonalFacil = []
    fila = 0
    columna = 0

    for i in range(0, len(matriz)):
        diagonalFacil.append(matriz[fila][columna])

        fila =fila+ 1
        columna =columna+ 1

    return diagonalFacil

def getDiagonalDificil(matriz):

    diagonalDificil = []

    columna = len(matriz) -1 

    for fila in range(0, len(matriz)):
        diagonalDificil.append(matriz[fila][columna])
        columna = columna- 1
        
    return diagonalDificil

def sumaDiagonal(esPrincipal, matriz):
    suma = 0
    
    if esPrincipal:
        diagonal=getDiagonalFacil(matriz)    
    else:
        diagonal=getDiagonalDificil(matriz)
    for elemento in diagonal:
        suma=suma+elemento    
    return suma

resultadoDiagonalFacil = getDiagonalFacil(matriz)
resultadoDiagonalDificil = getDiagonalDificil(matriz)

print(f"El resultado es {sumaDiagonal(True, matriz)}")
print(f"El resultado es {sumaDiagonal(False, matriz)}")