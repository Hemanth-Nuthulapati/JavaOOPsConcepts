package com.hemanth.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();

        Circle circle = new Circle();
        circle.area();

        Square square = new Square();
        square.area();

        // below code is late binding
        // because, the type of triangle is Shapes, even though the type is Shapes
        // it calls the method in the Triangle class's area method
        Shapes triangle = new Triangle();
        triangle.area();
    }
}
