def leer_numeros(cantidad):
    numeros = []
    for i in range(cantidad):
        num = int(input("Introduce un número: "))
        numeros.append(num)
    return numeros

def filtrar_terminan_en_3(lista):
    resultado = []
    for n in lista:
        if n % 10 == 3:
            resultado.append(n)
    return resultado

def Todo():
    numeros = leer_numeros(10)
    terminan_en_3 = filtrar_terminan_en_3(numeros)
    print("Números que terminan en 3:", terminan_en_3)

Todo()
