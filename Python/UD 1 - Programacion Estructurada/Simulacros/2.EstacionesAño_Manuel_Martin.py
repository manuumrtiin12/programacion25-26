dia = int(input("Dime el dia: "))
mes = int(input("Dime el mes: "))

hemisferio = input("Dime el emisferio [Norte/Sur]: ").lower

estacion = ""
while mes <= 12 and dia <= 31:
    dia = int(input("Dime el dia: "))
    mes = int(input("Dime el mes: "))
    
    while hemisferio == "norte" or hemisferio == "sur":
        if hemisferio == "norte":
            if (mes == 3 and dia >= 21) or (mes > 3 and mes < 6) or (mes == 6 and dia < 21):
                estacion = "Primavera"
            elif (mes == 6 and dia >= 21) or (mes > 6 and mes < 9) or (mes == 9 and dia < 23):
                estacion = "Verano"
            elif (mes == 9 and dia >= 23) or (mes > 9 and mes < 12) or (mes == 12 and dia < 21):
                estacion = "Otoño"
            else:
                estacion = "Invierno"

        
        elif hemisferio == "sur":
            if (mes == 9 and dia >= 23) or (mes > 9 and mes < 12) or (mes == 12 and dia < 21):
                estacion = "Primavera"
            elif (mes == 12 and dia >= 21) or (mes >= 1 and mes < 3) or (mes == 3 and dia < 21):
                estacion = "Verano"
            elif (mes == 3 and dia >= 21) or (mes > 3 and mes < 6) or (mes == 6 and dia < 21):
                estacion = "Otoño"
            else:
                estacion = "Invierno"
        
    print(f"La estacion es {estacion}")

