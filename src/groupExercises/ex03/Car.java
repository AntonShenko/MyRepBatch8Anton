package groupExercises.ex03;

public class Car {
    double carPrice;
    double length,weight;
    String color;
    double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car {
    Sedan(double carPrice, double length) {
        if (length > 20) {
            System.out.println("5% discount for Sedan: " + carPrice * .05);
        } else {
            System.out.println("10% discount for Sedan: "+carPrice * .10);
        }
    }
}
class Truck extends Car {
    Truck(double carPrice, double weight) {
        if (weight > 2000) {
            System.out.println("10% discount for Truck : " + carPrice * .10);
        } else {
            System.out.println("20% discount for Truck : " + carPrice * .20);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Truck obj = new Truck(10000, 2500);
        Truck obj1 = new Truck(100000, 1500);
        Sedan obj2 = new Sedan(100000, 25);
        Sedan obj3 = new Sedan(100000, 15);
    }
}