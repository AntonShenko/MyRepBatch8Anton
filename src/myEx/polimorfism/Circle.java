package myEx.polimorfism;

public class Circle extends Shape {

    double rad;
    double pi = 3.14;

    public Circle(double rad) {
        this.rad = rad;
    }

    public String color() {
        return "blue";
    }

    @Override
    double s() {
        return pi * rad * rad;
    }
}
