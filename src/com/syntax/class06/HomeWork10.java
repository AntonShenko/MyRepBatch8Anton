package com.syntax.class06;

import java.util.Scanner;

public class HomeWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		int month;
		String message;
		
		x=new Scanner(System.in);
		System.out.println("Input a number between 1-12");
		month=x.nextInt();
		
		switch (month)
		{
		case 1:
			message="January";
			break;
		case 2:
			message="February";
			break;
		case 3:
			message="March";
			break;
		case 4:
			message="April";
			break;
		case 5:
			message="May";
			break;
		case 6:
			message="June";
			break;
		case 7:
			message="July";
			break;
		case 8:
			message="August";
			break;
		case 9:
			message="September";
			break;
		case 10:
			message="October";
			break;
		case 11:
			message="November";
			break;
		case 12:
			message="December";
			break;
		default:
			message="Invalid";
		}	
		System.out.println(message);
		
	}

}