package com.syntax.class12;

import java.util.Scanner;

public class ChangeFirstCharToUpperCase {
    public static void main(String[] args) {
        String[] week = new String[7];

        Scanner x = new Scanner(System.in);

        for(int i=0; i<week.length; i++) {
            System.out.println("Please enter day "+ (i+1) +" of the week");
            String ans = x.nextLine();
            week[i] = ans;
        }
        for(int e=0; e< week.length; e++){
            char[] step = week[e].toCharArray();
            step[0] = Character.toUpperCase(step[0]);
            System.out.println(step);
        }

    }
}
