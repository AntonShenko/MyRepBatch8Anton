package com.syntax.class09;

public class HomeWork08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height = 4;
		int width = 4;
		
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
