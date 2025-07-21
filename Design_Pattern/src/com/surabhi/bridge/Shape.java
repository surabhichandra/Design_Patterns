package com.surabhi.bridge;

class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void draw(){
        color.Coloring();;
    }
}

class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }
}
class Square extends Shape{
    public Square(Color color) {
        super(color);
    }
}

class Color{
    public void Coloring(){
        System.out.println("Hi I'm default coloring");
    }
}
class RedColor extends Color{
    public void Coloring(){
        System.out.println("Hi I'm Red");
    }
}
class BlueColor extends Color{
    public void Coloring(){
        System.out.println("Hi I'm blue");
    }
}

class Main{
    public static void main(String[] args) {
        Shape blueSquare = new Shape(new BlueColor());
        blueSquare.draw();


    }
}
