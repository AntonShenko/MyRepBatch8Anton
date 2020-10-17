package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner (System.in);
		
		System.out.println("Please enter a grade");
		String grade=x.nextLine();
		
		String yourGrade;
		
		switch(grade.toUpperCase()) //datatype of variable must match with datatype of cases
		{
		case "A":
			yourGrade="A-Excellent";
			break;
		case "B":
			yourGrade="B-Good";
			break;
		case "C":
			yourGrade="C-Average";
			break;
		case "D":
			yourGrade="D-Bad";
			break;
		default:
			yourGrade="Grade";
			break;
		}
		System.out.println("Your Grade is: "+yourGrade);	
			
	}

}
