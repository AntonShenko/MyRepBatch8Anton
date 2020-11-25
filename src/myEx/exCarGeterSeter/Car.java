package myEx.exCarGeterSeter;

public class Car {

    private double carPrice;
    private double length;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "carPrice=" + carPrice +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;

    }
}



class Main{
    public static void main(String[] args) {
        Car sedan = new Car();
        sedan.setCarPrice(100000);
        sedan.setLength(22);
        sedan.setColor("white");

        Car sedan2 = new Car();

        System.out.println(sedan.toString());

    }
}
