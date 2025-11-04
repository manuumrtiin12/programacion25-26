contadorClientes = 0
contadorClientesVIP = 0

listaCorreos = ["manuel@gmail.com", "pepe@mailcom"]

eleccion_menu = ""

while eleccion_menu != "G":
    print("==========================================================")
    print("         A) Añadir cliente                                ")
    print("         V) Validar emails almacenados                    ")
    print("         C) Contar clientes de un dominio                 ")
    print("         M) Mostrar los % de clientes premium y normales  ")
    print("         G) Salir                                         ")
    print("==========================================================")

    eleccion_menu = input("¿Qué quieres hacer?: ").upper()

    if eleccion_menu == "A":
        continuar = "S"
        while continuar == "S":
            
            status = input("¿El cliente es VIP? S/N: ").upper()
            while status != "S" and status != "N":
                print("Error. Introduce S o N.")
                status = input("¿El cliente es VIP? S/N: ").upper()

            
            correo = input("Introduce el correo del cliente: ")
            listaCorreos.append(correo)
            contadorClientes += 1
            if status == "S":
                contadorClientesVIP += 1
                print("El cliente es VIP")
            else:
                print("El cliente no es VIP")

            
            continuar = input("¿Quieres seguir añadiendo? S/N: ").upper()
            while continuar != "S" and continuar != "N":
                print("Error. Introduce S o N.")
                continuar = input("¿Quieres seguir añadiendo? S/N: ").upper()
    
    elif eleccion_menu == "V": 
        listaCorreosInvalidos = []

        for correo in listaCorreos:
            if "@" in correo:
                partes = correo.split('@')
                dominio = partes[1]  
                if "." not in dominio:
                    listaCorreosInvalidos.append(correo)
            else:
                listaCorreosInvalidos.append(correo)

            print(f"Cantidad de correos inválidos: {len(listaCorreosInvalidos)}")
            print(f"Los correos inválidos son: {listaCorreosInvalidos}")
            print(f"Los correos válidos son: {listaCorreos}")

            volver = input("¿Desea volver?: ")
                    
