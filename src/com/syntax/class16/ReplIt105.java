package com.syntax.class16;
import java.util.Scanner;
public class ReplIt105 {

    //105
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            System.out.print(ch);
        }
        }

    }
}
