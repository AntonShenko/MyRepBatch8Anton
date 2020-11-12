package com.syntax.repl_It;

public class R127 {
//???
    static String ss = "Welcome To Syntax Technologies";

    public static void main(String[] args) {
        System.out.println(ss);

        System.out.println(R127.ss);//2

        R127 print = new R127();//3
        System.out.println(print.ss);

    }
}
