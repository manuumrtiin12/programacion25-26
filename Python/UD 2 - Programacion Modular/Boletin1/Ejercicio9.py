def convertir_tiempo(segundos_totales):
    horas = segundos_totales // 3600
    segundos_restantes = segundos_totales % 3600
    minutos = segundos_restantes // 60
    segundos = segundos_restantes % 60
    return horas, minutos, segundos

def mostrar_tiempo(horas, minutos, segundos):
    print("Horas:", horas)
    print("Minutos:", minutos)
    print("Segundos:", segundos)

pedirSegundos = int(input("Dame una cantidad de tiempo en segundos: "))

resultado = convertir_tiempo(pedirSegundos)

horas = resultado[0]
minutos = resultado[1]
segundos = resultado[2]

mostrar_tiempo(horas, minutos, segundos)