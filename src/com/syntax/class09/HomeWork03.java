package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxx = 7;
		int r = 0;
		int c = 0;
		
		for(r=1; r<=7; r++)
		{
			for(c=1; c<=maxx; c++)
			{
				System.out.print(c+" ");
			}
			maxx--;
			System.out.println();
		}
		
		maxx = 2;
		for(r=2; r<=7; r++)
		{
			for(c=1; c<=maxx; c++)
			{
				System.out.print(c+" ");
			}
			maxx++;
			System.out.println();
		}
		
	}
}
