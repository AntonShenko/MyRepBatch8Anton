package myEx.exesCar;
interface Car {
    double carPrice = 0;//we cant use this variable. Because its Interface Class, they must defined. f.e Pi=3.14;
    String color = null;//we cant use this variable as well.
    String calculateSalePrice();

}

class Sedan implements Car {
    double carPrice;
    double length;

    public Sedan(double carPrice, double length) {
        this.carPrice = carPrice;
        this.length = length;
    }

    @Override
    public String calculateSalePrice() {
        if (length > 20) {
            return "This Sedan price is " + carPrice + ". Your discount is 5% -" + carPrice * .05 +"$.";
        } else {
            return "This Sedan price is " + carPrice + ". Your discount is 10% -" + carPrice * .10 +"$.";
        }
    }
}

class Truck implements Car {
    double carPrice;
    double weight;

    public Truck(double carPrice, double weight) {
        this.carPrice = carPrice;
        this.weight = weight;
    }

    @Override
    public String calculateSalePrice() {
        if (weight > 2000) {
            return "This Truck price is " + carPrice + ". Your discount is 10% -" + carPrice * .10 +"$.";
        } else {
            return "This Truck price is " + carPrice + ". Your discount is 20% -" + carPrice * .20 +"$.";
        }
    }
}
class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(90000, 23);
        Truck truck = new Truck(100000, 2500);
        Car[] cars = {sedan, truck, new Sedan(70000, 18), new Truck(80000, 1500)};
        for (Car car:
             cars) {
            System.out.println(car.calculateSalePrice());
        }
    }
}