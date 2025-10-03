numero = int(input("Dame un numero: "))
suma = 0

if numero < 0:
    print("No puedes usar un numero negativo, reinicie manualmente el programa...")

for i in range(1, numero+1):
    suma += i
     
print(suma)