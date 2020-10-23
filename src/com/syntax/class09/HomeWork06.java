package com.syntax.class09;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("enter value of width:");
		int width = input.nextInt();
		System.out.println("enter value of height:");
		int height = input.nextInt();
		
		for(int r=1; r<=height; r++)
		{
			for(int c=1; c<=width; c++)
			{
				if((r>=2 && r<=height-1) && (c>=2 && c<=width-1))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("$ ");
				}
			}
			
			System.out.println();
			
		}
	}

}
