def calculaTempMedia():
    diasAñadir = int(input("¿Cuantos dias quieres añadir?: "))
    tempmax = int(input("Cual es la temperatura maxima de hoy: "))
    tempmin = int(input("Cual es la temperatura minima de hoy: "))

    resultado = (tempmax + tempmin) / 2

    print(f"El resultado es: {resultado}ºC")


calculaTempMedia()