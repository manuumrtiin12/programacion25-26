matriz = []

def crearMatriz(matriz):
    fila = 1

    while fila <= 4:              
        listaAñadir = []
        columna = 1               

        while columna <= 5:
            numero = fila + columna
            listaAñadir.append(numero)
            columna += 1

        matriz.append(listaAñadir)
        fila += 1

crearMatriz(matriz)
print(matriz)
