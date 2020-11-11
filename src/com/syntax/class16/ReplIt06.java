package com.syntax.class16;

class Car {
    String carColor;
    int carYear;
    String carMake;

}
public class ReplIt06 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.carColor="Black";
        bmw.carYear=2019;
        bmw.carMake="BMW";

        Car toyota = new Car();
        toyota.carColor="White";
        toyota.carYear=2018;
        toyota.carMake="Toyota";

        System.out.println("Car color is " + bmw.carColor + " and car year is " + bmw.carYear + " and car model is " + bmw.carMake);
        System.out.println("Car color is " + toyota.carColor + " and car year is " + toyota.carYear + " and car model is " + toyota.carMake);
    }
}
