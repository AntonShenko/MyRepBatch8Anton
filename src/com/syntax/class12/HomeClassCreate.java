package com.syntax.class12;
class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    public double radius;
    public String color;

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
public class HomeClassCreate {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.color = "purple";

        //c1.double  = getArea()
        Double area = c1.getArea();
        System.out.println(area);

        Circle c2 = new Circle();
        c2.radius = 14;
        c2.color = "yellow";

        area = c2.getArea();
        System.out.println(area);

    }
}




/**
 * The Circle class models a circle with a radius and color.
 */
