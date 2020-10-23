package com.syntax.class10;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter amount");
		int am = s.nextInt();
		
		int num[] = new int[am];
		System.out.println("enter numbers");
		for(int i=0; i<am; i++) {
			num[i] = s.nextInt();
		}
		
		int total = 0;
		for(int i=0; i<am; i++) {
			total = total + num[i];
		}
		
		int mean = total/am;
		System.out.println(mean);
	}

}
