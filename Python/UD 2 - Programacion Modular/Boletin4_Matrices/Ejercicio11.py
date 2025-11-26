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

        fila += 1
        columna += 1

    return diagonalFacil

def getDiagonalDificil(matriz):

    diagonalDificil = []

    columna = len(matriz) -1 

    for fila in range(0, len(matriz)):
        diagonalDificil.append(matriz[fila][columna])
        columna -= 1
        
    return diagonalDificil

def sumaDiagonal(esPrincipal, diagonalFacil, diagonalDificil):

    suma = 0
    if esPrincipal == True:
        getDiagonalFacil(matriz)

        for i in range(len(diagonalFacil)):
            suma += diagonalFacil[i]
        
        return suma
    
    elif esPrincipal == False:
        getDiagonalDificil(matriz)

        for i in range(len(diagonalDificil)):
            suma += diagonalDificil[i]
        
        return suma

resultadoDiagonalFacil = getDiagonalFacil(matriz)
resultadoDiagonalDificil = getDiagonalDificil(matriz)

print(f"El resultado es {sumaDiagonal(True, resultadoDiagonalFacil, resultadoDiagonalDificil)}")
print(f"El resultado es {sumaDiagonal(False, resultadoDiagonalFacil, resultadoDiagonalDificil)}")