package replS_It.repl_It_121to170;

public class R146 {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public R146(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public R146(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public R146(int numberOfDoors, int topSpeed, double price) {
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public R146(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }
}

class MainR146 {
    public static void main(String[] args) {
        R146 print1 = new R146("Toyota", "Prius", 4,120, 30000);
        System.out.println(print1.make+" " + print1.model+" " + print1.numberOfDoors+" " + print1.topSpeed+" " +print1.price);

        R146 print2 = new R146("Toyota", "Prius",120, 30000.0 );
        System.out.println(print2.make+" " + print2.model+" " + print2.numberOfDoors+" " + print2.topSpeed+" " +print2.price);

        R146 print3 = new R146(4, 120, 30000.0);
        System.out.println(print3.make+" " + print3.model+" " + print3.numberOfDoors+" " + print3.topSpeed+" " +print3.price);

        R146 print4 = new R146("Toyota", "Prius", 4);
        System.out.println(print4.make+" " + print4.model+" " + print4.numberOfDoors+" " + print4.topSpeed+" " +print4.price);

    }
}
    //1. Complete the Car.java class:
    //Create the following variable (Choose proper datatype)
    //* make
    //* model
    //* numberOfDoors
    //* topSpeed
    //* price
    //following the proper naming convention for variables.
    //
    //Write four constructors:
    //* The first constructor(with all parameters)
    //* A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
    //* A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor)
    //* A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
    //
    //Create a display method in Cars class to print the class variable value in console.
    //
    //2. Test your code with the Main.java class:
    //Create several Car objects using all Constructors.
    //then call display method with each object.

