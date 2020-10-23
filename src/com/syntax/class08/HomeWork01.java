package com.syntax.class08;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		int num1;
		int num2;
		
		
		System.out.println("please enter first number of range");
		num1 = x.nextInt();
		System.out.println("please enter second number of range");
		num2 = x.nextInt();
		

	}
	

}
/*Write a program that reads a range of integers (start and end point), 
 * provided by a user and then from that range 
 prints the sum of the even and odd integers.
 Scanner scanner = new Scanner(System.in);
System.out.println("Please enter two different number");
int start = scanner.nextInt();
int end = scanner.nextInt();
int sumEven = 0;
int sumOdd = 0;
for (int i = start; i <= end; i++) {
    if (i%2 == 0) {
        sumEven += i;
    } else {
        sumOdd += i;
    }
}
System.out.println("The sum of even number from start to end that you entered is " + sumEven);
System.out.println("The sum of odd number from start to end that you entered is " + sumOdd);*/
