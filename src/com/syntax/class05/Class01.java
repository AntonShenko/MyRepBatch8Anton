package com.syntax.class05;
import java.util.Scanner;
public class Class01
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Scanner x;
		x = new Scanner (System.in);
		
		System.out.println("Whatr is your score?");
		int score=x.nextInt();
		String txt="Invalid";		
			if(score>=90) txt="A, you are good";			
			else if(score>=70 && score<90) txt="B, you are good";
			else if(score>=50 && score<70) txt="D, study more!";
			else txt="F, study more!";			
		System.out.println("Grede is "+txt);
				
	}

}
