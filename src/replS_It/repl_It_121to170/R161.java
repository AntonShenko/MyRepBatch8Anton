package replS_It.repl_It_121to170;

public class R161 {
    static class Parent{
        String city;

        public Parent(String city) {
            this.city = city;
        }
        public void display(){
            System.out.println("City name " + city);
        }
    }

    static class Child extends Parent{

        public Child(String city) {
            super(city);
        }
    }

    public static void main(String[] args) {
        Child child = new Child("Fairfax");
        child.display();
    }
}
//Create Class call Parent.
//create a class String variable call city.
//create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.
//create method with below specification.
//access modifier public.
//return type void
//name display
//
//Write to logic print below sentence.
//"City name " + the value of class variable.
//
//Create Child Class.
//inherit to Parent class.
//create Child constructor with one String parameter called city.
//call super constructor and pass the parameter.
//
//in Main Class.
//Create and object of Child class. pass city name as "Fairfax" and call the display method.
//
//Output.
//City name Fairfax