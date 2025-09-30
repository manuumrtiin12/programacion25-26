dia = input("Que dia de la semana quieres ver el horario?: ").upper()

match dia:
    
    case "LUNES":
        print("|==========================|")
        print("|           LUNES          |")
        print("|==========================|")
        print("|8:00/9:00 Programacion    |")
        print("|9:00/10:00 Programacion   |")
        print("|==========================|")
   
    case "MARTES":
        print("|==========================|")
        print("|          MARTES          |")
        print("|==========================|")
        print("|8:00/9:00 Programacion    |")
        print("|9:00/10:00 Programacion   |")
        print("|==========================|")
  
    case "SABADO":
        print("Dia de Reflexion")
    
    case "DOMINGO": 
        print("Dia de Reflexion")
    
    case _:
        print("Formato Invalido")

