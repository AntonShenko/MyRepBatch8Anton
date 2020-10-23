package com.syntax.class10;

import java.util.Scanner;

public class ReviewClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		char operation;
		double results;
		boolean continueLoop=true;
		String end;
		
		while(continueLoop) {
		System.out.println("Please Enter two numbers");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		System.out.println("Please Enter the operation + - * /");
		operation = scanner.next().charAt(0);
		switch (operation) {
		case '+':
			results = num1 + num2;
			break;
		case '-':
			results = num1 - num2;
			break;
		case '*':
			results = num1 * num2;
			break;
		case '/':
			results = num1 / num2;
			break;
		default:
			results = 0;
		}
		System.out.println("Results are " + results);
		System.out.print("Enter Yes to perform more operations and No to terminate the program");
		end=scanner.next();
		if("No".equals(end)) {
			continueLoop=false;
		}
		}
	}
}
