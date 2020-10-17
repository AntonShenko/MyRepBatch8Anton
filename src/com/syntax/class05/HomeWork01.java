package com.syntax.class05;
import java.util.Scanner;
public class HomeWork01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		int sales;
		int num1=0;
		
		
		System.out.println("What is your sales amount USD?");
		sales = x.nextInt();
		if (sales>10 && sales<=100) num1=10; 
		else if (sales>100 && sales<=200) num1=20;
		else if (sales>200 && sales<=500) num1=30;
		else if (sales>500) num1=50;
		
		double num2=(num1*sales)/100;
		
		System.out.println("You getting commition "+num1+"%");
		System.out.println("Your total amount to receive: "+num2+"USD");
	}

}
