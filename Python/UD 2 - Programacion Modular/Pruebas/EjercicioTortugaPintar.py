import turtle

def pintaCuadrado(color, lado, x, y):
    turtle.goto(x, y)

    for i in range(4):
        turtle.color(color)
        turtle.forward(lado)
        turtle.right(90)

pintaCuadrado("blue", 100, 0, 0)
pintaCuadrado("red", 100, 200, 200)
pintaCuadrado("yellow", 500, -200, -200)
turtle.hideturtle()
turtle.done()
