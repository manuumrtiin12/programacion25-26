matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

def BusquedaDePares(matriz):
    pares = []

    for fila in matriz:      
        for valor in fila:         
            if valor % 2 == 0:       
                pares.append(valor)

    return pares

print(BusquedaDePares(matriz))

