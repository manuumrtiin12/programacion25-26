numero = int(input("Dame un número: "))
div = 1
resultadoDivision = numero

while resultadoDivision != 0:
    resultadoResto = numero % 10        
    print(resultadoResto)
    numero = numero // 10               
    resultadoDivision = numero          
