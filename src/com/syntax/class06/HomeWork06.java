package com.syntax.class06;
import java.util.Scanner;
public class HomeWork06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x;
		x = new Scanner(System.in);
		int mark;
		
		System.out.println("Please enter your mark");
		mark = x.nextInt();
		if(mark>01 && mark<=25)
		{
			System.out.println("Your grade is F");
		}
		else if(mark>25 && mark<=45)
		{
			System.out.println("Your grade is E");
		}
		else if(mark>45 && mark<=50)
		{
			System.out.println("Your grade is D");
		}
		else if(mark>50 && mark<=60)
		{
			System.out.println("Your grade is C");
		}
		else if(mark>60 && mark<=80)
		{
			System.out.println("Your grade is B");
		}
		else if(mark>80)
		{
			System.out.println("Your grade is A");
		}
		else 
		{
			System.out.println("Please enter valid mark");
		}
		
	}

}
/*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. 

Example Output:
Please enter your mark
Your grade is A

Example Output:
Please enter your mark
Please enter valid mark*/