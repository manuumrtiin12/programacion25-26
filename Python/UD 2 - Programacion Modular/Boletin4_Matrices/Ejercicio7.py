matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
    ]

def sumaColumna(matriz):
    suma = 0

    for i in range(len(matriz)):
        if i == 0:
            suma += matriz[i][i]
        
        elif i % 2 == 0:
            suma += matriz[i][i]
    
    print(f"La cantidad total es: {suma}")
    return suma

sumaColumna(matriz)