usuarios = []

puntuacionGeneral = []

puntuacion1 = []
puntuacion2 = []
puntuacion3 = []

def altaUsuario(usuarios):
    usuariosAñadir = int(input("Cuantos usuarios quieres añadir: "))
    for i in range(usuariosAñadir):
        nombre = input("Nombre del usuario: ")
        usuarios.append(nombre)
        puntuacion1.append(0)
        puntuacion2.append(0)
        puntuacion3.append(0)
        puntuacionGeneral.append(0)
    return usuarios

def consultaUsuario(usuarios, puntuacionGeneral):
    for i in range(len(usuarios)):
        print(f"Nombre: {usuarios[i]} Puntuacion General: {puntuacionGeneral[i]}")

def consultaUsuarioPorPrueba(usuarios, nombrePrueba):
    for i in range(len(usuarios)):
        if nombrePrueba == "Prueba 1":
            print(f"Nombre: {usuarios[i]} Puntuacion: {puntuacion1[i]}")
        elif nombrePrueba == "Prueba 2":
            print(f"Nombre: {usuarios[i]} Puntuacion: {puntuacion2[i]}")
        elif nombrePrueba == "Prueba 3":
            print(f"Nombre: {usuarios[i]} Puntuacion: {puntuacion3[i]}")
        else:
            print("Prueba no valida")
            break

def puntuacionesPorJugadores(usuarios, puntuacionGeneral, puntuacion1, puntuacion2, puntuacion3):
    nombre = input("Nombre del usuario: ")
    if nombre in usuarios:
        i = usuarios.index(nombre)
        print("Usuario encontrado")
        print(f"Puntuacion general: {puntuacionGeneral[i]}")
        print(f"Puntuacion 1: {puntuacion1[i]}")
        print(f"Puntuacion 2: {puntuacion2[i]}")
        print(f"Puntuacion 3: {puntuacion3[i]}")
    else:
        print("Usuario no encontrado")

def notaPrueba():
    correcta = input("¿La solución es correcta? (s/n): ")
    if correcta.lower() != "s":
        return 0
    minutos = int(input("Minutos tardados: "))
    return 10 / minutos

def actualizarPuntuacionGeneral(i):
    puntuacionGeneral[i] = (
        puntuacion1[i] * 0.25 +
        puntuacion2[i] * 0.35 +
        puntuacion3[i] * 0.40
    )

def introducirResultadosPrueba(numeroPrueba):
    for i in range(len(usuarios)):
        print(f"\nJugador: {usuarios[i]}")
        nota = notaPrueba()
        if numeroPrueba == 1:
            puntuacion1[i] = nota
        elif numeroPrueba == 2:
            puntuacion2[i] = nota
        elif numeroPrueba == 3:
            puntuacion3[i] = nota
        actualizarPuntuacionGeneral(i)
    print("\nResultados de la prueba actualizados.")

def listadoMayorMenor(usuarios, puntuacionGeneral):
    print("\nCLASIFICACIÓN GENERAL (mayor a menor):")
    combinados = list(zip(puntuacionGeneral, usuarios))
    combinados.sort(reverse=True)
    for puntos, nombre in combinados:
        print(f"{nombre} → {puntos}")

def menu():
    while True:
        print("\n--- MENÚ ---")
        print("1. Alta usuarios")
        print("2. Consulta usuario general")
        print("3. Consulta por prueba")
        print("4. Introducir resultados Prueba 1")
        print("5. Introducir resultados Prueba 2")
        print("6. Introducir resultados Prueba 3")
        print("7. Consulta puntuaciones por jugador")
        print("8. Clasificación general")
        print("0. Salir")

        opcion = input("Elige: ")

        if opcion == "1":
            altaUsuario(usuarios)
        elif opcion == "2":
            consultaUsuario(usuarios, puntuacionGeneral)
        elif opcion == "3":
            prueba = input("Nombre de prueba (Prueba 1 / Prueba 2 / Prueba 3): ")
            consultaUsuarioPorPrueba(usuarios, prueba)
        elif opcion == "4":
            introducirResultadosPrueba(1)
        elif opcion == "5":
            introducirResultadosPrueba(2)
        elif opcion == "6":
            introducirResultadosPrueba(3)
        elif opcion == "7":
            puntuacionesPorJugadores(usuarios, puntuacionGeneral, puntuacion1, puntuacion2, puntuacion3)
        elif opcion == "8":
            listadoMayorMenor(usuarios, puntuacionGeneral)
        elif opcion == "0":
            break
        else:
            print("Opción no válida")

menu()
