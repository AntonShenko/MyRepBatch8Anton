package com.syntax.class05;
import java.util.Scanner;
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner x;
		x = new Scanner (System.in);
		
		System.out.println("Please enter your month");
		String month=x.nextLine();
		
		if(month=="June" && month=="July" && month== "August")	
				
		{	
		System.out.println("Your season is Summer. You were born in "+month);
		}
			
	}

}
