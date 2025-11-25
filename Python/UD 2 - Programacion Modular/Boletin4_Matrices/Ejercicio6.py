matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
    ]

def sumaColumna(matriz):
    suma = 0
    columna = int(input("Que columna quieres sumar: "))

    for i in range(len(matriz)):
        suma += matriz[i][columna]
    
    print(f"La cantidad total es: {suma}")
    return suma

sumaColumna(matriz)