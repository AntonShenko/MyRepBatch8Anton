package myEx.methodOverLoad;

public class PrivatMethWith3overL {

    String method(String name){
        return ("Hi " + name);
    }
    String method(String name, String lastName) {
        return ("Hi " + name + " your last name is " + lastName);
    }
    String method(String name, int phoneNum){
        return  ("Hi " + name + " your phone " + phoneNum);
    }

    public static void main(String[] args) {
        PrivatMethWith3overL print = new PrivatMethWith3overL();
        print.method("Anton");
        print.method("Anton", "Shenco");
        print.method("Anton", "7777777");

        System.out.println(print.method("Anton"));
    }
}
