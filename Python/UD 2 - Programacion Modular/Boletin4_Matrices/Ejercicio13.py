matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

def sumaPorFilasIgual():

    fila0 = 0
    fila1 = 0
    fila2 = 0
    indice = 0

    for fila in matriz:
        for numero in fila:

            if indice == 0:
                fila0 += numero
            
            elif indice == 1:
                fila1 += numero
            
            elif indice == 2:
                fila2 += numero
        
        indice += 1
    
    return fila0 == fila1 and fila0 == fila2


def sumaPorColumnasIgual():

    col0 = 0
    col1 = 0
    col2 = 0

    for fila in matriz:
        col0 += fila[0]
        col1 += fila[1]
        col2 += fila[2]

    return col0 == col1 and col0 == col2


def sumaTotalIgual():

    if sumaPorFilasIgual() and sumaPorColumnasIgual():
        print("La suma por filas y por columnas es la misma.")
    else:
        print("La suma total NO coincide entre filas y columnas.")


sumaTotalIgual()
