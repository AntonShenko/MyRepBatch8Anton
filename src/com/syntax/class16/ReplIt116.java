package com.syntax.class16;

public class ReplIt116 {

    public static boolean bothEven(int a, int b){
        if(a%2==0 && b%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(bothEven(4,6));
        System.out.println(bothEven(3,4));
        System.out.println(bothEven(-1,1));


    }
}
