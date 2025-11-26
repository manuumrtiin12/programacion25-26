matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
    ]

def getDiagonalFacil(matriz):
    diagonalFacil = []
    fila = 0
    columna = 0

    for i in range(0, len(matriz)):
        diagonalFacil.append(matriz[fila][columna])

        fila += 1
        columna += 1

    return diagonalFacil

def getDiagonalDificil(matriz):

    DiagonalDificil = []

    columna = len(matriz) -1 

    for fila in range(0, len(matriz)):
        DiagonalDificil.append(matriz[fila][columna])
        columna -= 1
        
    return DiagonalDificil

resultado = getDiagonalDificil(matriz)

print(resultado)