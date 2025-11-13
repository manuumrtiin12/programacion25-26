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
        if len(listaJuego) == 9 and numeroMinasGuardas > 0:
            print(f"Tienes que encontrar {numeroMinasGuardas} minas")
            intentos = int(input("¿Cuantos intentos quieres utilizar?: "))

            if intentos > len(listaJuego)-1:
                print("El numero maximo de intentos es 8")
                intentos = int(input("¿Cuantos intentos quieres utilizar?: "))
            
            elif intentos < numeroMinasGuardas:
                print("El numero de intentos tiene que ser mayor o igual al numero de minas")
                intentos = int(input("¿Cuantos intentos quieres utilizar?: "))

            for i in range(intentos):
                posicion = int(input("¿Cual posicion quieres probar? [1/8]: "))
                posicionInLista = listaJuego[posicion]

                if posicion > 8 or posicion == 0:
                    print(f"Error: La posicion debe ser entre 1 y 8 [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")

                if posicionInLista == " ":
                    intentos -= 1
                    puntuacion -= 1
                    print(f"¡Agua! Has fallado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")
                    
                elif posicionInLista == "X":
                    intentos -= 1
                    puntuacion += 1
                    numeroMinasGuardas -= 1
                    print(f"¡Mina! Has acertado... [Puntuacion: {puntuacion} | Minas restantes: {numeroMinasGuardas}]")

                if numeroMinasGuardas == 0:
                    print(f"Has encontrado todas las minas [Puntuacion final {puntuacion}]")
                    listaJuego = ["Invalido"]
                    numeroMinasGuardas = 0
                    puntuacion = 0
                
                elif intentos == 0:
                    if numeroMinasGuardas > 0:
                        print("No has encontrado todas las minas, crea un tablero nuevo e intentalo otra vez...")
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