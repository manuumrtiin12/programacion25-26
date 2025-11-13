import random

def menu():
    print("=" * 41)
    print("[T] Pulas T para generar un nuevo tablero")
    print("[J] Pulsa J para jugar")
    print("[E] Pulsa E para salir del Juego")
    print("=" * 41)

def leeYvalidaMenu():
    
    menu()
    opcionMenu = input("Elige una opcion: ").lower()

    while opcionMenu != "t" and opcionMenu != "J" and opcionMenu != "E":
        opcionMenu = input("Elige una opcion: ").lower()

    while opcionMenu != "e":

        if opcionMenu == "T":
            resultados = cargaTablero()

        elif opcionMenu == "j":
            Juego(resultados[0], resultados[1])
        
        menu()
        opcionMenu = input("Elige una opcion: ").lower()

    ejecutaTerminar()        

def cargaTablero():
    numeroMinasGuardas = 0
    tablero = ["Invalido"]
    print("Cargando tablero...")

    for i in range(0, 8):
        generadorBombas = random.randint(0, 1)

        if generadorBombas == 0:
            tablero.append(" ")
        elif generadorBombas == 1:
            tablero.append("X")
            numeroMinasGuardas += 1
    
    print(f"¡Tablero generado! Se han escondido {numeroMinasGuardas} minas. Tablero: {tablero}")
    return tablero, numeroMinasGuardas

def Juego(tablero, numeroMinasGuardas):
    if len(tablero) == 9:
        puntuacion = 0
        while numeroMinasGuardas != 0:
            posicion = int(input("¿Cual posicion quieres probar? [1/8]: "))

            if posicion > 8 or posicion == 0:
                print(f"Error: La posicion debe ser entre 1 y 8 [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")
            else:
                posicionInLista = tablero[posicion]
                if posicionInLista == " ":
                    puntuacion -= 1
                    print(f"¡Agua! Has fallado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")
                elif posicionInLista == "X":
                    puntuacion += 1
                    numeroMinasGuardas -= 1
                    print(f"¡Mina! Has acertado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")
                tablero[posicion] = "-"
        print(f"Has encontrado todas las minas [Puntuacion final {puntuacion}]")
        tablero = ["Invalido"]
        numeroMinasGuardas = 0
        puntuacion = 0
    else:
        print("Antes de jugar debes crear un tablero...")

def ejecutaTerminar():
    print("Saliendo")


leeYvalidaMenu()
