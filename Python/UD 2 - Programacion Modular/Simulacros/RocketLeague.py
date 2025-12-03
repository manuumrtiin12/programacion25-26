faseInicialPuntuaciones = []
faseSemifinalPuntuaciones = []
faseFinalPuntuaciones = []

faseInicialNombres = []
faseSemifinalNombres = []
faseFinalNombres = []

def menu():
    print("[R] Registrar puntuaciones de equipo")
    print("[L] Listar equipos y su puntuación por fase")
    print("[C] Clasificados por fase")
    print("[S] Salir")
    opcionMenu = input("Que quieres hacer?: ").upper()

    while opcionMenu != "S":

        if opcionMenu == "R":
            
            registroPuntuacion()
        
        elif opcionMenu == "L":
            print("Saliendo...")
            listarPorFase(faseInicialPuntuaciones, faseInicialNombres, faseSemifinalPuntuaciones, faseSemifinalNombres, faseFinalPuntuaciones, faseFinalNombres)
        
        elif opcionMenu == "C":
            print("Saliendo...")
            #ToDo 
        
        elif opcionMenu == "S":
            print("Saliendo...")
        
        else:
            print("Valor incorrecto...")
             
            print("[R] Registrar puntuaciones de equipo")
            print("[L] Listar equipos y su puntuación por fase")
            print("[C] Clasificados por fase")
            print("[S] Salir")
            opcionMenu = input("Que quieres hacer?: ").upper()

        print("[R] Registrar puntuaciones de equipo")
        print("[L] Listar equipos y su puntuación por fase")
        print("[C] Clasificados por fase")
        print("[S] Salir")
        opcionMenu = input("Que quieres hacer?: ").upper()

def registroPuntuacion():

    seleccionFase = input("Que fase quieres escoger [Inicial | Semifinal | Final]: ").upper()

    equipo = 1
    if seleccionFase == "INICIAL":
        for i in range(0,9):
            equipoRegistrarNombre = input(f"Cual es el nombre del equipo {equipo}: ")
            faseInicialNombres.append(equipoRegistrarNombre)

            equipoRegistrarPuntuacion = int(input(f"Cual es la puntuacion del equipo {faseInicialNombres[i]}: "))
            faseInicialPuntuaciones.append(equipoRegistrarPuntuacion)

            equipo += 1

        print("===================================")
        print("PUNTUACION REGISTRADA CORRECTAMENTE")
        print("===================================")


    elif seleccionFase == "SEMIFINAL" and len(faseInicialPuntuaciones) > 0:
        equipo = 1

        for i in range(0,5):
            equipoRegistrarNombre = input(f"Cual es el nombre del equipo {equipo}: ")
            faseSemifinalNombres.append(equipoRegistrarNombre)

            equipoRegistrarPuntuacion = int(input(f"Cual es la puntuacion del equipo {faseInicialNombres[i]}: "))
            faseSemifinalPuntuaciones.append(equipoRegistrarPuntuacion)

            equipo += 1

        print("===================================")
        print("PUNTUACION REGISTRADA CORRECTAMENTE")
        print("===================================")
        
    elif seleccionFase == "FINAL" and len(faseSemifinalPuntuaciones) > 0:
        equipo = 1

        for i in range(0,3):
            equipoRegistrarNombre = input(f"Cual es el nombre del equipo {equipo}: ")
            faseFinalNombres.append(equipoRegistrarNombre)

            equipoRegistrarPuntuacion = int(input(f"Cual es la puntuacion del equipo {faseInicialNombres[i]}: "))
            faseFinalPuntuaciones.append(equipoRegistrarPuntuacion)

            equipo += 1

        print("===================================")
        print("PUNTUACION REGISTRADA CORRECTAMENTE")
        print("===================================")

    else:
        print("Valor incorrecto, intentalo de nuevo...")
        seleccionFase = input("Que fase quieres escoger [Inicial | Semifinal | Final]: ").upper()

    return faseInicialPuntuaciones, faseInicialNombres, faseSemifinalPuntuaciones, faseSemifinalNombres, faseFinalPuntuaciones, faseFinalNombres
    
def listarPorFase(faseInicialPuntuaciones, faseInicialNombres, faseSemifinalPuntuaciones, faseSemifinalNombres, faseFinalPuntuaciones, faseFinalNombres):

    fase = input("Que fase quiere listar? [Inicial | Semifinal | Final]: ").upper()

    if fase == "INICIAL":

        if len(faseInicialPuntuaciones) > 0:
            print("=============================")
            print("PUNTUACION DE LA FASE INICIAL")
            print("=============================")

            for i in range(len(faseInicialPuntuaciones)):
                print(f"{faseInicialNombres[i]}: {faseInicialPuntuaciones[i]} puntos")
        
        else:
            print("La fase Inicial aun no a sido registrada")
    
    elif fase == "SEMIFINAL":

        if len(faseSemifinalPuntuaciones) > 0:
            print("===============================")
            print("PUNTUACION DE LA FASE SEMIFINAL")
            print("===============================")

            for i in range(len(faseSemifinalPuntuaciones)):
                print(f"{faseSemifinalNombres[i]}: {faseSemifinalPuntuaciones[i]} puntos")

        else:
            print("La fase Semifinal aun no a sido registrada")


    elif fase == "FINAL":

        if len(faseFinalPuntuaciones) > 0:
            print("===========================")
            print("PUNTUACION DE LA FASE FINAL")
            print("===========================")

            for i in range(len(faseFinalPuntuaciones)):
                print(f"{faseFinalNombres[i]}: {faseFinalPuntuaciones[i]} puntos")
        
        else:
            print("La fase Final aun no a sido registrada")


    else: 
        print("Valor incorrecto...")
        fase = input("Que fase quiere listar? [Inicial | Semifinal | Final]: ").upper()




    

 
