package com.syntax.class05;

import java.util.Scanner;
public class Recap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan;
		String answer;
		double balance;
		
		scan = new Scanner (System.in);
		System.out.println("Do you have credit card?");
		
		answer=scan.next();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What is the balance?");
			balance = scan.nextDouble();
			if(balance<1000)
			{
				System.out.println("Please pay off your balance!!!");
			}
			else
			{
				System.out.println("You can spend more!!!");
			}
		}
		else
		{
			System.out.println("Would you like to get a card?");
		}
	
	
	}

}
