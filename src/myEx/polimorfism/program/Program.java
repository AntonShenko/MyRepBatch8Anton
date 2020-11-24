package myEx.polimorfism.program;

    public class Program{

        public static void main(String[] args) {

            Person bob = new Person();      // вызов первого конструктора без параметров
            bob.displayInfo();

            Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
            tom.displayInfo();

            Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
            sam.displayInfo();
        }
    }
class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        name = "no name";
        age = 18;
    }
    Person(String n)
    {
        name = n;
        age = 18;
    }
    Person(String name, int a)
    {
        this.name = name;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s\t Age: %d\n", name, age);
    }
}