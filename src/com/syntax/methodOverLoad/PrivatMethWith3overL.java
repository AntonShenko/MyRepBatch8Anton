package com.syntax.methodOverLoad;

public class PrivatMethWith3overL {

    private String method(String name){
        return ("Hi " + name);
    }
    private String method(String name, String lastName) {
        return ("Hi " + name + " your last name is " + lastName);
    }
    private String method(String name, int phoneNum){
        return  ("Hi " + name + " your phone " + phoneNum);
    }

    public static void main(String[] args) {
        PrivatMethWith3overL print = new PrivatMethWith3overL();
        print.method("Anton");
        print.method("Anton", "Shenco");
        print.method("Anton", "7777777");

    }
}
