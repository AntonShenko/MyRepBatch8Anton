package com.syntax.class04;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		String gender = x.next(); 
		
		System.out.println("Please enter your age ");
		int age = x.nextInt();
	
		if(gender.equals("m"))
		{
			if (age>=25)
			{
				System.out.println("Man");
			}
			else
			{
				System.out.println("Boy");
			}
		}
		
		else
		{	
			if (age>=25)
			{
				System.out.println("Woman");
			}
			else
			{
				System.out.println("Girl");
			}
		}
		
		/*if (gender.equals("m") && age>=25)	
		{
			System.out.println("Man");
		}	
		else if (gender.equals("m") && age<25)
		{
			System.out.println("Boy");
		}	
		else if (gender.equals("f") && age>=25)
		{
			System.out.println("Woman");
		}	
		else if (gender.equals("f") && age<25)
		{
			System.out.println("Girl");
		}*/
		
	}

}
