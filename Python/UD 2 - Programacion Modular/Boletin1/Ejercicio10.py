def a_horas(segundos):
    horas = segundos / 3600
    return horas

def a_minutos(segundos):
    minutos = segundos / 60
    return minutos

def a_segundos(horas, minutos, segundos):
    total = horas * 3600 + minutos * 60 + segundos
    return total

opcion = ""

while opcion != "-1":
    print("\nMENÚ DE CONVERSIONES")
    print("H - Convertir segundos a horas")
    print("M - Convertir segundos a minutos")
    print("S - Convertir horas y minutos a segundos")
    print("-1 - Salir")

    opcion = input("Elige una opción: ").upper()

    if opcion == "H":
        segundos = int(input("Introduce los segundos: "))
        print("Equivale a", a_horas(segundos), "horas")

    elif opcion == "M":
        segundos = int(input("Introduce los segundos: "))
        print("Equivale a", a_minutos(segundos), "minutos")

    elif opcion == "S":
        horas = int(input("Introduce las horas: "))
        minutos = int(input("Introduce los minutos: "))
        segundos = int(input("Introduce los segundos: "))
        print("Equivale a", a_segundos(horas, minutos, segundos), "segundos")

    elif opcion == "-1":
        print("Saliendo del programa...")

    else:
        print("Opción no válida. Inténtalo de nuevo.")
