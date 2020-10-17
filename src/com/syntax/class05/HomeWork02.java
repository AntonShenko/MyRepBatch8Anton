package com.syntax.class05;
import java.util.Scanner;
public class HomeWork02 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		
		int num1=x.nextInt(); 
		int num2=x.nextInt(); 
		int num3=x.nextInt();
		int l=0;
		
		if (num1>num2 && num1>num3) l=num1;
		else if (num2>num1 && num2>num3) l=num2;
		else if (num3>num1 && num3>num2) l=num3;
		else if (num1==num2 && num2==num3) l=num1;

		System.out.println("The largest number is "+l);
	
	}

}
