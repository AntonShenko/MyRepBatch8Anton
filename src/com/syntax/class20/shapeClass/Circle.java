package com.syntax.class20.shapeClass;

public class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    public void radiusCalc(){
        System.out.println(super.rad()*super.rad()*piii());
    }

    public static void main(String[] args) {
        Circle print = new Circle(10);
        print.radiusCalc();
    }
}
