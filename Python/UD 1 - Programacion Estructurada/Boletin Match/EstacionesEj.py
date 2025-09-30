mes = int(input("Dime un mes del año por su posicion numerica: "))
dia = int(input("En que dia de ese mes: "))
match mes:
    case 1 | 2 | 3:
        if mes == 3 and dia <= 20:
            print("Bienvenido/a al Invierno")
        
        if mes == 3 and dia > 20:
            print("Bienvenido/a a la Primavera")
           
 
    case 4 | 5 | 6:
        if mes == 6 and dia <= 20:
            print("Bienvenido/a a la Primavera")
        
        if mes == 6 and dia > 20:
            print("Bienvenido/a al Verano")

    
    case 7 | 8 | 9:
        if mes == 9 and dia <= 20:
            print("Bienvenido/a al Verano")
        
        if mes == 9 and dia > 20:
            print("Bienvenido/a al Otoño")

    case 10 | 11 | 12:
        if mes == 12 and dia <= 20:
            print("Bienvenido/a al Otoño")
        
        if mes == 12 and dia > 20:
            print("Bienvenido/a al Invierno")

    
    case _:
        print("No valido")
