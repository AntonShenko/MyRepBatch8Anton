package com.syntax.class06;
import java.util.Scanner;
public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		Boolean thirsty;
		Boolean sleepy;
		
		System.out.println("Are you thirsty?");
		thirsty = x.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = x.nextBoolean();
		if (thirsty && !sleepy)
		{
			System.out.println("Drink water");
		}
		else if (thirsty && sleepy)
		{
			System.out.println("Drink coffee");
		}
		else if (!thirsty && sleepy)
		{
			System.out.println("Drink tea");
		}
		else 
		{
			System.out.println("Nothing");
		}
	}

}
/*Take 2 boolean inputs from a user:
	 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

Output:
Looks like you need to drink ___*/