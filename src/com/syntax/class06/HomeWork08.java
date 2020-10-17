package com.syntax.class06;
import java.util.Scanner;
public class HomeWork08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x;
		int week;
		String message;
		
		x=new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		week=x.nextInt();
		
		switch (week)
		{
		case 1:
			message="Monday";
			break;
		case 2:
			message="Tuesday";
			break;
		case 3:
			message="Wednesday";
			break;
		case 4:
			message="Thursday";
			break;
		case 5:
			message="Friday";
			break;
		case 6:
			message="Saturday";
			break;
		case 7:
			message="Sunday";
			break;
		default:
			message="Invalid";
		}	
		System.out.println(message);
		}

}
