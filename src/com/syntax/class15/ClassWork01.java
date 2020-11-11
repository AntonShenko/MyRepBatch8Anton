package com.syntax.class15;

import java.util.Scanner;

public class ClassWork01 {
    public static void main(String[] args) {

     Scanner x = new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String mom = x.nextLine();
        System.out.println("Dad’s first name?");
        String dad = x.nextLine();
        System.out.println("Is it boy? ");
        boolean gender = x.nextBoolean();

        if (gender) {
            System.out.println(dad.substring(0, 3) + mom.substring(mom.length()-2));
        }else {
            System.out.println(mom.substring(0,3)+dad.substring(3,6) );
        }



    }
}
