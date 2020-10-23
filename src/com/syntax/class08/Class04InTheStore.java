package com.syntax.class08;

import java.util.Scanner;

public class Class04InTheStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		String item;
		int price;
		int money = 0;
		
		System.out.println("Please enter the item you want to buy");
		item = x.next();
		System.out.println("Please enter the price USD of this item");
		price = x.nextInt();
		System.out.println("Please insert " + price + "$");
		money = x.nextInt();
		
		while(money<price)
		{
			System.out.println("Sorry the amount is not enough, please insert " + (price-money) + "$ more!");
			int n = x.nextInt();
			money += n;
		}
		System.out.println("Please take your " + item + "!");
		
		int change=money-price;
		System.out.print("And here is your change: " + change + "$");
	}

}
/*Write a program to ask a user to enter item they want to buy and the price of that item. 
 * Every time user enters money accumulate the amount and tell the user how much is left to pay off. 
 * If user give more money program should return a change. 
 * Whenever a user done with payments program should say “Thank you for shopping!”
 * 
 */