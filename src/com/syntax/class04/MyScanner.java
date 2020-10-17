package com.syntax.class04;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
    Scanner s;
    s = new Scanner(System.in);

	System.out.println("Age: ");
	int age = s.nextInt();

		if (age > 18 && age < 70)		       
		{		          
		System.out.println("You can have some cigarette and continue...");		        
		}
		        
		else if (age > 70)		       
		{		            
			if (age > 70 && age < 80)
		            
			{          
			System.out.println("Cigarettes in your age can injure your health please continue...");
			}       
		}
		            
		else if (age < 18 && age>12) 	           
		{
			System.out.println("Getc a fuck out of here smal little pussy!!!"); 
		}
		                    
		else
		{
			System.out.println("NO cigarettes, call your mammy");
		}

	System.out.println("Your age is " + age + ", please enter your name: ");
	
	String name = s.next();
	System.out.println("Ok, goods to meet you "+name+" and where are you from? ");
	
	String city = s.next();
	System.out.println("Nice, I love "+city+" and I am from Bostnioa!))) What would you drink? ");
	
	String drink = s.next();
	System.out.println("Ok, I also love "+drink+" take it please. And what would you like to eat? ");
	
	String eat = s.next();
	System.out.println("Nice choice Here is your "+eat);
	
	
	
	System.out.println("--------------------------------------------------------");
	

	
	
	}
}
							
		
		
	