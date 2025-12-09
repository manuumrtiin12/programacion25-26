import random

def getListaSinRepetidos(filas, carton):
    carton = []

    for i in range(filas):
        fila = []

        numeroRandom1 = random.randint(1, 15)
        numeroRandom2 = random.randint(16, 30)
        numeroRandom3 = random.randint(31, 45)
        numeroRandom4 = random.randint(46, 60)
        numeroRandom5 = random.randint(61, 75)

        if filas == 3:
            numeroRandom1 = random.randint(1, 15)
            numeroRandom2 = random.randint(16, 30)
            numeroRandom3 = random.randint("-")
            numeroRandom4 = random.randint(46, 60)
            numeroRandom5 = random.randint(61, 75)

        fila.append(numeroRandom1)
        numeroCompletos.append(numeroRandom1)
        fila.append(numeroRandom2)
        numeroCompletos.append(numeroRandom2)
        fila.append(numeroRandom3)
        numeroCompletos.append(numeroRandom3)
        fila.append(numeroRandom4)
        numeroCompletos.append(numeroRandom4)
        fila.append(numeroRandom5)
        numeroCompletos.append(numeroRandom5)

        

        return carton, fila


def generaCarton(carton, fila):
    cerrar = True

    while cerrar:
        getListaSinRepetidos(filas, carton)

        if fila not in carton:
            carton.append(fila)

        else:
            getListaSinRepetidos(filas, carton)

        if len(carton) == 5:
            cerrar == False


filas = 5
carton = []
numeroCompletos = []

fila = getListaSinRepetidos(filas, carton)
resultado = generaCarton(carton, fila)

assert len(carton) == 5
assert carton[3][2] == "-"