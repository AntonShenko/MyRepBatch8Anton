package com.syntax.class16;

public class ReplIt109to111 {
    //109
    public static void newLine02(){
        System.out.println("newLine method implementation");
    }


    //110
    public static void newLine(){
        System.out.println("newLine method implementation");
    }
    public static void displayLine(){
        System.out.println("displayLine method implementation");
    }




    //111
    public static String syntaxTechnologies(){
        return "Welcome to Syntax Technologies!";
    }
    public static String syntaxStudents(){
        return "Welcome Syntax Students!";
    }


    public static void main(String[] args) {
        System.out.println(syntaxTechnologies());//111
        System.out.println(syntaxStudents());//111

        newLine();//110
        displayLine();//110

        newLine02(); //109
        newLine02(); //109
        newLine02(); //109

    }





}
