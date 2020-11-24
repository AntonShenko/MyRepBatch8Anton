package replS_It.repl_It_121to170;

public class R149 {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    public R149() {
    }

    public R149(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }
}
class MainR149 {
    public static void main(String[] args) {
        R149 emp = new R149();
        System.out.println(emp.name+" " + emp.lastName+" " + emp.employeeId+" " + emp.startDate+" " + emp.salary);

        R149 emp2 = new R149("Joe", "Smith", 12345, "01/01/1970", 35000);
        System.out.println(emp2.name+" " + emp2.lastName+" " + emp2.employeeId+" " + emp2.startDate+" " + emp2.salary);
    }
}

