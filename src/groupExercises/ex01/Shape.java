package groupExercises.ex01;

interface Shape {
    void calculateArea();
    void calculatePerimiter();
}

class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Circle area");
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("Circle perimiter");
    }
}

class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Square area");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Square perimiter");
    }
}
class Main{
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
            shapes[i].calculatePerimiter();
        }
    }
}