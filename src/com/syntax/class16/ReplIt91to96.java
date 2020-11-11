package com.syntax.class16;

import java.util.Scanner;

public class ReplIt91to96 {
    public static void main(String[] args) {

        //091
        String str1 = "syntax technologies";
        String str2 = "SYNTAX TECHNOLOGIES";
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        //092
        String s1="hello how are you";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("world"));
        System.out.println(s1.endsWith("are"));
        System.out.println(s1.endsWith("you"));

        //093
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(' '));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));

        //094
        String str4 = "I love Java classes at Syntax";
        System.out.println(str4.substring(12,29));
        System.out.println(str4.substring(0,11));

        //095
        Scanner input = new Scanner(System.in);
        System.out.println();
        String word = input.nextLine();
        System.out.println("the first 3 letters of "+word+" is "+word.substring(0,3));

        //096
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();
        if(language.equals("Java")){
            System.out.println("Java is a programming language");
        }
        else if(language.toUpperCase().equals("C")){
            System.out.println("C is a procedural programming language");
        }
        else if(language.toUpperCase().equals("C++")){
            System.out.println("C++ is a middle-level programming language");
        }
        else {
            System.out.println("Doesn't match any programming language");
        }


    }
}
