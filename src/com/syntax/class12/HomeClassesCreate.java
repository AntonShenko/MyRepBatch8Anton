package com.syntax.class12;

class Square{
    int side;
    double getArea(){
        return side*side;
    }

}


public class HomeClassesCreate {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.side = 6;

        double area = s1.getArea();
        System.out.println(area);
    }
}
