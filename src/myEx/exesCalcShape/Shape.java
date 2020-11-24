package myEx.exesCalcShape;

public interface Shape {
    double pi = 3.14;
    String calculateArea();
    String calculatePerimeter();
}

class Circle implements Shape{
    public Circle(double r) {
        this.r = r;
    }

    double r;

    @Override
    public String calculateArea() {
        double s = pi * r * r;
        return "Circle square is " + s;
    }

    @Override
    public String calculatePerimeter() {
        double p = 2 * pi * r;
        return "Circle perimeter is " + p;
    }
}

class Square implements Shape{
    double x;
    double y;

    public Square(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String calculateArea() {
        double s = x * y;
        return "Square perimeter is " + s;
    }
    @Override
    public String calculatePerimeter() {
        double p = x*2 + y*2;
        return "Square perimeter is " + p;
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(3, 4);
        Shape[] shapes = {circle, square};
        for (Shape shape:
             shapes) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }
}