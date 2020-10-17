package com.syntax.class04;

public class NestedIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean allergy=true;
		
		boolean petAllergy=true;
		
		if (allergy) {
			System.out.println("Lets do further check");
			
		    if(petAllergy) {
		    	System.out.println("Please no pets at home");
		   }else {
			   System.out.println("This is good you do not have pet already");
		   }
			
		}else {
			System.out.println("You are lucky");
		}
		
		System.out.println("------------------example 2-------------");
		
		boolean isFriday=true;
		int date=13;
		boolean monday=true;
		
		if (isFriday) {
			
			if(date==13) {
			System.out.println("Watching scary movie");
			}else {
			System.out.println("I will watch PK ");
			}
			
		} else {
			if(monday) {
				System.out.println("I am not studying, I am working");
			}else {
				System.out.println("I have a class");
			}
		}
		
		System.out.println("----------------Example 3---------------------");
		
		
		int score = 65;
		boolean assigment=true;
		
		if (assigment) {
			if(score>90) {
				System.out.println("You are great!!!");
			}else if(score>80) {
				System.out.println("You did good");
			}else if(score>70) {
				System.out.println("Study more");
			}else {
				System.out.println("Study more");
			}
			
		}else {
			System.out.println("You should alweys complete all assiignments'");
		}
		
		
		System.out.println("----------------Example 4---------------------");
		
		boolean hasDiploma = true;
		double gpa = 3.3;
		
		
		if (hasDiploma) {
			System.out.println("Congratualtions!");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should study hard to get a scholarship.");
			}
			
			
		} else {
			System.out.println("You should study");
		} 
		
		System.out.println("----------------Example 5---------------------");
	
		double MortRate = 4.6;
		double MortPrice =220000;
		if (MortRate > 4.5) 
		{
			System.out.println("I will not buy a House!");
		} 
		else 
		{
			System.out.println("I'll buy");
		}
		
		if (MortPrice > 200000) 
		{
			System.out.println("I will take a loan!");
		} 
		else 
		{
			System.out.println("I will pay by cash!");
		}
	
		System.out.println("----------------Example 5b---------------------");
		
		double morgRate, morgPrice;
		morgRate = 4.4;
		morgPrice = 1000;
		
		if (morgRate < 4.5) 
		{
			System.out.println("I think to buy");
			if (morgPrice > 20000) 
			{
				System.out.println(" you can get loan");
			}
			else 
			{
				System.out.println(" I am rich I can pay cash");
			}	
		}
		else 
		{
			System.out.println("I am not buying the house");	
		}
	}
	}

