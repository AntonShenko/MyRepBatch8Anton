package myEx.exesCar;
interface Car {

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
            return "5% discount for Sedan: " + carPrice * .05 + " is your discount";
        } else {
            return "10% discount for Sedan: " + carPrice * .10 + " is your discount";
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
            return "10% discount for Truck : " + carPrice * .10 + " is your discount";
        } else {
            return "20% discount for Truck : " + carPrice * .20 + " is your discount";
        }
    }
}
class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(90000, 23);
        Truck truck = new Truck(100000, 2500);
        Car[] cars = {sedan, truck, new Sedan(90000, 18), new Truck(100000, 1500)};
        for (Car car:
             cars) {
            System.out.println(car.calculateSalePrice());
        }
    }
}