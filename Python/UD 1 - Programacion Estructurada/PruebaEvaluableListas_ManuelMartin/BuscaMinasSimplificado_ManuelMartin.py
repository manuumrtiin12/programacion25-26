import random

listaJuego = ["Invalida"]
numeroMinasGuardas = 0
puntuacion = 0

print("=" * 41)
print("[T] Pulas T para generar un nuevo tablero")
print("[J] Pulsa J para jugar")
print("[E] Pulsa E para salir del Juego")
print("=" * 41)
opcionMenu = input("Elige una opcion: ").lower()

while opcionMenu != "e":

    if opcionMenu == "t":
        print("Generando tablero...")

        for i in range(0, 8):
            generadorBombas = random.randint(0, 1)

            if generadorBombas == 0:
                listaJuego.append(" ")
            
            elif generadorBombas == 1:
                listaJuego.append("X")
                numeroMinasGuardas += 1

        print(f"¡Tablero generado! Se han escondido {numeroMinasGuardas} minas. Tablero: {listaJuego}")
    
    elif opcionMenu == "j":
        print(f"Tienes que encontrar {numeroMinasGuardas} minas")

        if len(listaJuego) == 9:
            while numeroMinasGuardas != 0:
                posicion = int(input("¿Cual posicion quieres probar? [1/8]: "))
                posicionInLista = listaJuego[posicion]

                if posicion > 8 or posicion == 0:
                    print(f"Error: La posicion debe ser entre 1 y 8 [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")

                if posicionInLista == " ":
                    puntuacion -= 1
                    print(f"¡Agua! Has fallado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")
                
                elif posicionInLista == "X":
                    puntuacion += 1
                    numeroMinasGuardas -= 1
                    print(f"¡Mina! Has acertado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")

            print(f"Has encontrado todas las minas [Puntuacion final {puntuacion}]")
            listaJuego = ["Invalido"]
            numeroMinasGuardas = 0
            puntuacion = 0
            
        else:
            print("Antes de jugar debes crear un tablero...")

    else:
        print("Opcion invalida, intentalo de nuevo...")

    print("=" * 41)
    print("[T] Pulas T para generar un nuevo tablero")
    print("[J] Pulsa J para jugar")
    print("[E] Pulsa E para salir del Juego")
    print("=" * 41)
    opcionMenu = input("Elige una opcion: ").lower()

print("Saliendo...")