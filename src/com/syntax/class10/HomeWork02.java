package com.syntax.class10;

import java.util.Scanner;

public class HomeWork02 
{
	public static void main(String[] args) 
	{
		 double sum = 0;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter amount of numbers");
		 int amount = s.nextInt();
		 System.out.println("enter numbers you wanto to store");
		 
		 double num[] = new double[amount];
		 for(int i=0; i<amount; i++) {
			 num[i] = s.nextDouble();
			 sum = sum + num[i];
		 }
		 System.out.println("sum:" +sum);
	}
}