package com.syntax.class16;

import java.util.Scanner;

public class ReplIt104 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] arr = new String[5];
    arr[0] = input.nextLine();
    arr[1] = input.nextLine();
    arr[2] = input.nextLine();
    arr[3] = input.nextLine();
    arr[4] = input.nextLine();

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i].substring(0,3));

    }
}
}

