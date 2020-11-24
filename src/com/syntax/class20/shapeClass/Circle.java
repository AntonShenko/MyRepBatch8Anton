package com.syntax.class20.shapeClass;

public class Circle extends Shape {

    Circle(int radius) {
        super(radius);
    }

    public void radiusCalc(){
        System.out.println((super.radius*super.radius)*3.14);
    }

    public static void main(String[] args) {
        Circle print = new Circle(10);
        print.radiusCalc();
    }
}
