package com.syntax.class09;

public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int r=1; r<=4; r++)
		{
			for(int c=1; c<=4; c++)
			{
				if((r==2 && c==2)||(r==2 && c==3)||(r==3 && c==2)||(r==3 && c==3))
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
