print("===============================")
print(" Habitacion | Camas | Planta   ")
print("  1.Azul    |   2   | Primera  ")
print("  2.Roja    |   1   | Primera  ")
print("  3.Verde   |   3   | Segunda  ")
print("  4.Rosa    |   2   | Segunda  ")
print("  5.Gris    |   1   | Tercera  ")
print("===============================")

numero = int(input("Dame un numero de habitacion: "))

match numero:

    case 1:
        print(f"La habitacion {numero} tiene 2 camas y esta en la primera planta")
    
    case 2:
        print(f"La habitacion {numero} tiene 1 camas y esta en la primera planta")
    
    case 3:
        print(f"La habitacion {numero} tiene 3 camas y esta en la segunda planta")
    
    case 4:
        print(f"La habitacion {numero} tiene 2 camas y esta en la segunda planta")
    
    case 5:
        print(f"La habitacion {numero} tiene 3 camas y esta en la tercera planta")
    
    case _:
        print("¡Solo estan permitidos los numeros de las habitaciones!")