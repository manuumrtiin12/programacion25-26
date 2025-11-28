filas = 4
columnas = 5
matriz = []

def generamatriz(matriz, filas, columnas):
    for i in range(filas):
        fila = []
        for columna in range(columnas):
            fila.append(i + columna)
        matriz.append(fila)

    return matriz

matrizcompleta = generamatriz(matriz, filas, columnas)
print(matrizcompleta)
