nombre = input("¿Cual es el nombre del Alumno?: ").upper

while nombre != "EXIT":

    calificacion = int(input("¿Cual es la calificacion del Alumno?: "))

    if calificacion >= 90 and calificacion <= 100:
        print(f"El alumno {nombre} a sacado un Sobresaliente")
        nombre = input("¿Cual es el nombre del Alumno?: ")

    elif calificacion >= 70 and calificacion <= 89:
        print(f"El alumno {nombre} a sacado un Notable")
        nombre = input("¿Cual es el nombre del Alumno?: ").upper


    elif calificacion >= 60 and calificacion <= 69:
        print(f"El alumno {nombre} a sacado un Bien")
        nombre = input("¿Cual es el nombre del Alumno?: ").upper


    elif calificacion >= 50 and calificacion <= 59:
        print(f"El alumno {nombre} a sacado un Suficiente")
        nombre = input("¿Cual es el nombre del Alumno?: ").upper


    elif calificacion >= 0 and calificacion <= 49:
        print(f"El alumno {nombre} a sacado un Suspenso")
        nombre = input("¿Cual es el nombre del Alumno?: ").upper
    
    else:
        print("¡Valor fuera de rango, intentalo de nuevo!")

print("Saliendo...")

