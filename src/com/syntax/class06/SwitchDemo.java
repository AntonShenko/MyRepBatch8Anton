package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Pleasae ener a browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase())
		{
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on Firefox browser";
			break;
		default:
			message="Entered browser is not suported";
		}	
	System.out.println(message);
			
		
		
		
		
	}

}
