package com.syntax.class09;

import java.util.Scanner;

public class HomeWork09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cash;
		int flow;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total numbers of money flows:");
		flow = input.nextInt();
		cash = new int [flow];
		
		for(int i=0; i<flow; i++)
		{
			System.out.println("Enter CashFlow in each");
			cash[i] = input.nextInt();
			total = total +cash[i];
		}
		System.out.println("Total amount of CashFlow is "+ total +" USD");
		
	}
}
