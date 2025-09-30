opcion1 = input("Dame opcion A o B o C: ").lower()

if opcion1 == "a":
    print("Alta")

elif opcion1 == "c":
    print("Cambio")

elif opcion1 == "b":
    print("Baja")

else:
    print("No valido")

opcion2 = int(input("Dame otra opcion 1 o 2 o 3: "))

match opcion2:
    case 1 | 10:
        print("Primera")
    
    case 2 | 20:
        print("Segunda")
    
    case 3 | 30: 
        print("Tercera")
    
    case _:
        print("No valido")