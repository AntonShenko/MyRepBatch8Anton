package com.syntax.class06;
import java.util.Scanner;
public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		Boolean answer;
		
		System.out.println("Is it weekend?");
		answer = x.nextBoolean();
		if(answer)
		{
			System.out.println("Today you will be learning Java");
		}
		else
		{
			System.out.println("Today you will be learning Manual testing");
		}
		
	}

}
 
/*For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
Today you will be learning ____*/