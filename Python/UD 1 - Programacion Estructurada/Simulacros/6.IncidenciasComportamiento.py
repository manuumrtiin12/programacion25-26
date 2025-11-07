grave = 0
leves = 0
moderados = 0
Eso = 0
PO = 0

incidentes = input("¿Desea registrar un nuevo incidente? S/N:  ").upper()

while incidentes != "N":
    if incidentes == "S":
        estudios = input("¿En qué nivel de estudios ha ocurrido el incidente?: ").upper()
        while estudios != "E" and estudios != "P":
            print("Opción no válida, inténtalo de nuevo.")
            estudios = input("¿En qué nivel ha ocurrido el incidente?: ").upper()

        gravedad = input("¿Cuál ha sido la gravedad del incidente?: ").upper()
        while gravedad != "L" and gravedad != "M" and gravedad != "G":
            print("Opción no válida, inténtalo de nuevo.")
            gravedad = input("¿Cuál ha sido la gravedad del incidente?: ").upper()

        if gravedad == "G":
            print("La gravedad del incidente es grave.")
            grave += 1
        elif gravedad == "M":
            print("La gravedad del incidente es moderado.")
            moderados += 1
        elif gravedad == "L":
            print("La gravedad del incidente es leve.")
            leves += 1

    else:
        print("Entrada no válida.")

    incidentes = input("¿Desea registrar un nuevo incidente?: ").upper()
total_incidentes = grave + moderados + leves
if total_incidentes > 0:
    porcentaje_ESO = (Eso * 100) // total_incidentes
    porcentaje_PO = (PO * 100) // total_incidentes
else:
    porcentaje_ESO = 0
    porcentaje_PO = 0

print("Incidentes registrados:")
print("Graves:", grave)
print("Moderados:", moderados)
print("Leves:", leves)

print("Se han producido un total de", total_incidentes, "incidentes en el centro:",leves, "de ellos leves, ", moderados, "de ellos moderados y", grave, "de ellos grave.")