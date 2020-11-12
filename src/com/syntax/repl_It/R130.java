package com.syntax.repl_It;

public class R130 {

    public void nonStaticM(){
        System.out.println("Programming is amazing.");
    }

    public static void staticMethod(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        R130 printNonS = new R130();
        printNonS.nonStaticM();//printing not static.

        staticMethod();//printing static method.
    }
}
