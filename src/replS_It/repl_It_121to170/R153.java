package replS_It.repl_It_121to170;

public class R153 {
    static class Person{
        String name;
        String lastName;
        int age;

        public Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
    }

    static class Employee extends Person{
        int salary;

        public Employee(String name, String lastName, int age, int salary) {
            super(name, lastName, age);
            this.salary = salary;

        }
    }

    static class Student extends Employee{
        int grade;

        public Student(String name, String lastName, int age, int grade) {
            super(name, lastName, age, 0);
            this.grade = grade;
        }
    }

    static class Retiree extends Student{
        String seniorActivity;

        public Retiree(String name, String lastName, int age, String seniorActivity) {
            super(name, lastName, age, 0);
            this.seniorActivity = seniorActivity;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35, 35000);
        System.out.println(employee.name+" " + employee.lastName+" " + employee.age+" " + employee.salary);

        Student student = new Student("Adam", "Smith", 15, 10);
        System.out.println(student.name+" " + student.lastName+" " + student.age+" " + student.grade);

        Retiree retiree = new Retiree("Frank", "Smith", 15, "tour");
        System.out.println(retiree.name+" " + retiree.lastName+" "+ retiree.age+" " + retiree.seniorActivity);
    }
}
