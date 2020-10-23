package com.syntax.class08;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--1-------------------------");
		
		int a;
		
		for(a=20; a>0; a-=2) 
		{
			System.out.print(a+" ");
		}
		
		System.out.println("\n--2-------------------------");
		
		int num=20;
		
		while (num>=1) 
		{
			System.out.print(num+" ");
			num-=2;
		}
		
		System.out.println("\n--3-----------------------------------------");
		
		for(a=20; a<=50; a++) 
		{
			if(a%2!=0) {
			System.out.print(a+" ");
			}
		}
		
		System.out.println("\n--4-----------------------------------------");
		
		int x;
		x = 20;
		while (x<=50) 
		{
			if (x%2!=0) {
				System.out.print(x+" ");
			}
			x++;
		}
		
		
		
	}
			
	}

