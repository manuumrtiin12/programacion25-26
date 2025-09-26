notaExamen = int(input("Cual es la nota del alumno en el examen final?: "))
asistenciaClase = float(input("Cual es el porcentaje de asistencia del alumno?: "))

if notaExamen >= 60 and asistenciaClase >= 80:
    print("Aprobado")

else:
    print("Suspendido")