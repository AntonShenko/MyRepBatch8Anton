package com.syntax.methodOverLoad;

public class StaticMethWith3overL {

    static String method(String name){
        return ("Hi " + name);
    }
    static String method(String name, String lastName) {
        return ("Hi " + name + " your last name is " + lastName);
    }
    static String method(String name, int phoneNum){
        return  ("Hi " + name + " your phone " + phoneNum);
    }

    public static void main(String[] args) {
        System.out.println(method("Anton"));
        System.out.println(method("Anton", "Shenco"));
        System.out.println(method("Anton", "7777777"));
    }
}
