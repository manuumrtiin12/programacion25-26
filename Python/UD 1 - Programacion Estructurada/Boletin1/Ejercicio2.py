edad = int(input("Dime tu edad para verificar si puedes votar: "))
nacionalidad = input("Dime tu nacionalidad para comprobar si puedes votar: ").lower

if edad >= 18 and nacionalidad == "española":
    print("Eres apto para votar")

else:
    print("No eres apto para votar")