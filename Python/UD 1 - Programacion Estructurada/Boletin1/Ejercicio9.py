cantidadSolicita = float(input("Cuanta es la cantidad que quieres solicitar?: "))
sueldoAnual = int(input("Cual es tu sueldo anual?: "))
puntaje = int(input("Cual es tu puntaje de credito?: "))
empleo = int(input("Cuanto años de trabajo le quedan a tu contrato?: "))

calculoPrestamo = sueldoAnual *0.01

if puntaje < 0 or empleo < 2 or cantidadSolicita > sueldoAnual: 
    print("No se te puede otorgar el credito")

else:
    print("Eres apto para el prestamo")

