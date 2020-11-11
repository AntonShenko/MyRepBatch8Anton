package com.syntax.class12;

import java.util.Scanner;

public class replIt {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int[] num = new int[5];

        for(int i=0; i<num.length; i++){
            int data = x.nextInt();
            num[i] = data;
        }
        for(int j=num.length-1; j>=0; j--){

            System.out.println(num[j]);
        }

    }
}
