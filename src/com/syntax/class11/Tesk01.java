package com.syntax.class11;

import java.util.Scanner;

public class Tesk01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// swap two variables
				Scanner scan = new Scanner(System.in);

				System.out.println("please enter two number");
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println("numbers befor swap: "+a+" and "+b);
				a = a + b;
				b = a - b;
				a = a - b;
				
				System.out.println("numbers after swap: "+a+" and "+b);
				System.out.println("------------------------------------");
				
				
				String c = "Hello";
				String d = "Buy";
				
				System.out.println(c+", "+d+";");
				
				c = c+d;
				d =	c.substring(0,5);
				c = c.substring(5);
				
				System.out.println(c+ ", "+d+";");
	}

}
