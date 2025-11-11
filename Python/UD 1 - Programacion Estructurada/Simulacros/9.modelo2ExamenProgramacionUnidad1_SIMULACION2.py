jugador1Victorias = 0
jugador2Victorias = 0

ApuestaJugador = input("Que quieres escoger Jugador1? [P]ares | [N]ones: ").lower()

jugador1 = int(input("Cuantos dedos quieres sacar? Jugador1: "))
jugador2 = int(input("Cuantos dedos quieres sacar? Jugador2: "))

while jugador1 and jugador2 != 0:

    if jugador1 or jugador2 > 5:
        print("Error, solo puedes sacar numeros del 1 al 5, intentalo de nuevo: ")
        jugador1 = int(input("Cuantos dedos quieres sacar? Jugador1: "))
        jugador2 = int(input("Cuantos dedos quieres sacar? Jugador2: "))
    
    if ApuestaJugador == "P":
        suma = jugador1 + jugador2

        if suma % 2 == 0:
            print("El jugador 1 ganador de esta ronda")
            jugador1Victorias += 1
        
        elif suma % 2 != 0:
            print("El jugador 2 ganador de esta ronda")
            jugador2Victorias += 1
    
    elif ApuestaJugador == "N":
        suma = jugador1 + jugador2

        if suma % 2 == 0:
            print("El jugador 2 ganador de esta ronda")
            jugador2Victorias += 1
        
        elif suma % 2 != 0:
            print("El jugador 1 ganador de esta ronda")
            jugador1Victorias += 1

    ApuestaJugador = input("Que quieres escoger Jugador1? [P]ares | [N]ones: ").lower()

    jugador1 = int(input("Cuantos dedos quieres sacar? Jugador1: "))
    jugador2 = int(input("Cuantos dedos quieres sacar? Jugador2: "))

print(f"Jugador 1: {jugador1Victorias} | Jugador 2: {jugador2}")

if jugador1Victorias > jugador2Victorias:
    print("El ganador es el Jugador 1")

elif jugador1Victorias < jugador2Victorias:
    print("El ganador es el Jugador 2")

else:
    print("Empate, nadie a ganado")
    




