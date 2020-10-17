package com.syntax.class06;
import java.util.Scanner;
public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x;
		x = new Scanner(System.in);
		Boolean answer;
		int score;
		
		System.out.println("Do you need a loan?");
		answer = x.nextBoolean();
		if(answer)
		{
			System.out.println("What is your credit score?");
			score = x.nextInt();
			if(score<=600)
			{
				System.out.println("Not eligble");
			}
			else if(score>600 && score<=700)
			{
				System.out.println("Maybe Eligble");
			}
			
			else if(score>700 && score<=800)
			{
				System.out.println("Eligble");
			}
			else
			{
				System.out.println("Definitely eligible");
			}
		}
		else
		{
			System.out.println("Unknown");

		}
		
	}

}



/*Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" . */  
