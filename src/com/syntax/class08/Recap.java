package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		int money;
		int waterPr=5;
		
		x = new Scanner(System.in);
		System.out.println("please pay for water");
		money = x.nextInt();
		
		while(money!=waterPr) {
			if(money>waterPr) {
				System.out.println("this is to much");
				//money=x.nextInt();
			}
			else {
				System.out.println("not enough money put more");
				//money=x.nextInt();
			} money=x.nextInt();

		}
		System.out.println("enjoy your water");
		
		}

}
