num1 = int(input("Dame un numero: "))
num2 = int(input("Dame otro numero: "))
num3 = int(input("Dame otro numero mas: "))

if num1 >= num2 and num1 >= num3:
    mayor = num1
    print("El numero ", mayor, " es el mas grande")

elif num2 >= num1 and num2 >= num3:
    mayor = num2
    print("El numero ", mayor, " es el mas grande")

else:
    mayor = num3
    print("El numero ", mayor, " es el mas grande")
