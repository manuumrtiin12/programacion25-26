
matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

def devuelveElemento(numFila, numCol):
    return matriz[numFila][numCol]

def devuelveFila(numFila):
    return matriz[numFila]

def devuelveColumna(numCol):
    lista = []
    for fila in matriz:
        lista.append(fila[numCol])
    return lista


print(devuelveElemento(0, 2))   
print(devuelveFila(1))          
print(devuelveColumna(0))       
