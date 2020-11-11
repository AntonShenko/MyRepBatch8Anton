package com.syntax.class15;

public class Palindrome {

    public static void main(String[] args) {

        String original = "race car";
        original = original.replace(" ", "");

        String reverse = "";
        for(int i=original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for (int j = 0; j < original.length(); j++) {
            if(original.charAt(j) != reverse.charAt(j)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
