package myEx.exCarGeterSeter;

public class Car {

    private double carPrice;
    private double length;
    private String color;

    public double calculateSalePrice() {
        if(length > 20) {
            return carPrice * .10 ;
        }
        else
            return carPrice * .05;
    }

    @Override
    public String toString() {
        return "new Sedan!!! " +
                "Price is " + carPrice +
                ", length is " + length +
                ", color is '" + color + '\'' +
                ", your discount is " + calculateSalePrice() +
                ". Total to pay " + (carPrice - calculateSalePrice()) +';';
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
}

class Truck extends Car{
    private double weight;

    @Override
    public String toString() {
        return "new Truck!!! " +
                "Price is " + getCarPrice() +
                ", weight is " + weight +
                ", color is '" + getColor() + '\'' +
                ", your discount is " + calculateSalePrice() +
                ". Total to pay " + (getCarPrice() - calculateSalePrice()) +';';
    }

    @Override
    public double calculateSalePrice() {
        if(weight > 2000) {
            return getCarPrice() * .20 ;
        }
        else
            return getCarPrice() * .10;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}



class Main{
    public static void main(String[] args) {
        Car sedan1 = new Car();
        sedan1.setCarPrice(100000);
        sedan1.setLength(18);
        sedan1.setColor("white");
        System.out.println(sedan1.toString());

        Car sedan2 = new Car();
        sedan2.setCarPrice(100000);
        sedan2.setLength(22);
        sedan2.setColor("black");
        System.out.println(sedan2.toString());

        Truck truck1 = new Truck();
        truck1.setCarPrice(100000);
        truck1.setWeight(1800);
        truck1.setColor("blue");
        System.out.println(truck1.toString());

        Truck truck2 = new Truck();
        truck2.setCarPrice(100000);
        truck2.setWeight(2500);
        truck2.setColor("brown");
        System.out.println(truck2.toString());



    }
}
