numero = int(input("Dame un numero: "))

if numero <= 0:
    print("El numero no puede ser menor que 0 ni 0 ")
    numero = int(input("intentalo de nuevo, dame un numero: "))


for i in range(1, numero+1):
    print(i)