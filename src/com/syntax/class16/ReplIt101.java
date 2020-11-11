package com.syntax.class16;

import java.util.Scanner;

public class ReplIt101 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String c = "";
        for(int i=0; i<word.length(); i+=2){
            c += word.charAt((i));

        }
        System.out.println(c);

    }
}
