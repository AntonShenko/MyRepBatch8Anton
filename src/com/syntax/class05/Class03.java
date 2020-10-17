package com.syntax.class05;
import java.util.Scanner;
public class Class03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner x;
		x = new Scanner (System.in);
		
		System.out.println("How many years do you work?");
		int years=x.nextInt();
		
		if (years>=5)
		{
		System.out.println("You are eligble for bonus! What is your anual salary?");
	
			int salary = x.nextInt();
			if(salary>50000)
			{
			System.out.println("You are getting bonus 5000$$$!!!");	
			}
			else
			{
				System.out.println("You are getting bonus 3000$$$!!!");
			}
		}
		else
		{
			System.out.println("You are not eligble for bonus");
		}		
		
		
	}
}
