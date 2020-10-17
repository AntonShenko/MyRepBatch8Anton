package com.syntax.class06;
import java.util.Scanner;
public class SweetchClassIntro 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner x;
		x = new Scanner (System.in);
		
		System.out.println("Please enter a day number");
		int day=x.nextInt();
		
		String today;
		
		switch(day) //datatype of variable must match with datatype of cases
		{
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Invalid Day";
			break;
		}
			
		System.out.println("Taday is "+today);
		
	}

}
