package com.syntax.class06;

import java.util.Scanner;

public class HomeWork12CalculSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner x=new Scanner(System.in);
			int num1=0;
			int num2=0;
			String op;
			
			System.out.println("Enter first number");
			num1=x.nextInt();
			System.out.println("Enter second number");
			num2=x.nextInt();
			System.out.println("Enter operator");
			op=x.next();
			switch (op)
			{
			case "+":
				System.out.println(num1+num2);	
				break;
			case "-":
				System.out.println(num1-num2);	
				break;
			case "*":
				System.out.println(num1*num2);	
				break;
			case "/":	
				if(num2!=0)
				{
					System.out.println(num1/num2);
				}
				else
				{
					System.out.println("can not perform operation");
				}	
				break;
			default:
				System.out.println("unnknown operator");
			}			
			
		
		}

	}

