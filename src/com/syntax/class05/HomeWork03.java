package com.syntax.class05;
import java.util.Scanner;
public class HomeWork03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		
		int num1=x.nextInt();//2
		int num2=x.nextInt();//7
		int num3=x.nextInt();//4
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("The largest number is "+num1);	
			}
			else
			{
				System.out.println("The largest number is "+num3);
			}
		}		
		else
		{
			if(num2>num3)
			{
				System.out.println("The largest number is "+num2);
			}
			else
			{
				System.out.println("The largest number is "+num3);
			}
		}
		
	}
}
