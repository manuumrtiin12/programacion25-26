import random


def generaAleatorio(listaNumeros):
    cerrar = True

    numero = random.randint(1, 75)

    while cerrar:
        if numero in listaNumeros:
            numero = random.randint(1, 75)

        else:
            listaNumeros.append(numero)
            cerrar = False
            
        return numero

def compruebaSiHayLineaEnFila(numeroFila, listaBolas, carton_bingo):
    filaElegida = carton_bingo[numeroFila]
    numerosEncontrados = []

    posicion = 0
    i = 0

    cartonValido = False
    cerrar = True

    while i < len(filaElegida) or cerrar:
        posicion = buscaNumeroEnLista(listaBolas, filaElegida)

        if posicion < 0:
            cerrar= False
        
        else:
            numerosEncontrados.append(filaElegida[posicion])
            
    if len(numerosEncontrados) == 5:
        cartonValido = True

    return cartonValido, filaElegida

def buscaNumeroEnLista(listaNumeros, numero):
    i = 0
    encontrado = False
    posicion = -1

    while i < len(listaNumeros) and not encontrado:

        if listaNumeros[i] == numero:
            encontrado = True
            posicion = i

        else:
            i += 1

    return posicion

def jugarALaLinea(listaBolas, carton_bingo, filaElegida):
    listaBolas = [12,17,44,47,74,5,21,1,29]
    bola = generaAleatorio(listaBolas)
    print(bola)
    print(listaBolas)
    hay = compruebaSiHayLineaEnFila(0, listaBolas, carton_bingo)
    print(hay)

    print(imprimeSalida(listaBolas, carton_bingo, filaElegida, hay))

def imprimeSalida(listaBolas, carton_bingo, filaElegida, cartonValido):

    if cartonValido == True:
        print("Se ha conseguido la LINEA en el carton:")
        print(f"Numero que ha salido al completar la fila: {filaElegida[len(listaBolas)]}")
        print(f"La fila acerntante a si la numero {filaElegida}: {carton_bingo[filaElegida]}")
        print(f"Todos los numeros que han salido son: {listaBolas}")
    
    else:
        print("Carton incorrecto")


carton_bingo = [
    [5,  21, 38,   50, 63],
    [12, 17, 44,   47, 74],
    [1,  29, "--", 55, 69],
    [9,  25, 32,   59, 61],
    [14, 19, 41,   52, 66]
]

listaBolas = [12,17,44,47,74,5,21,1,29]
bola = generaAleatorio(listaBolas)
print(bola)
print(listaBolas)
hay = compruebaSiHayLineaEnFila(0, listaBolas, carton_bingo)
print(hay)