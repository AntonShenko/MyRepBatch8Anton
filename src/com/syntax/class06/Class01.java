package com.syntax.class06;
import java.util.Scanner;
public class Class01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		
		String sale = scan.next();
		double disc, finPrice;
		
		if(sale.equalsIgnoreCase("yes")) 
		{
			System.out.println("What is the price?");
			double price = scan.nextDouble();
			
			if (price>=10 && price<50) 
			{
				disc=10;
			}
			else if (price>=50 && price<100) 
			{
				disc=20;
			}
			else if (price>=100 && price<500) 
			{
				disc=40;
			}
			else 
			{
				disc=50;
			}
			
		finPrice=price-price/100*disc;		
		System.out.println("Your final price is "+finPrice);	
		}
		
		else 
		{
			System.out.println("No shopping today");
		}
		
	}

}
