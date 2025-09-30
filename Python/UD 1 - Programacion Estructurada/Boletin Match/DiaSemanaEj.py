dia = input("Dime uno de los dias de la semana (L M X J V S D): ").upper()

match dia:
    case "L" | "M" | "X" | "J" | "V":
        print("Instituto")
    
    case "S" | "D":
        print("Casa")
    
    case _:
        print("Valor introducido no valido")

