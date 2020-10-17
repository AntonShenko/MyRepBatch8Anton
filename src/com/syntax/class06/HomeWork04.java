package com.syntax.class06;
import java.util.Scanner;
public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x;
		x = new Scanner(System.in);
		String fruit1;
		String fruit2;
		int num1;
		int num2;
		
		System.out.println("Please enter two strings");
		fruit1 = x.nextLine();
		fruit2 = x.nextLine();
		
		System.out.println("Please enter two numbers");
		num1 = x.nextInt();
		num2 = x.nextInt();
		
		if(num1==num2 && fruit1.equals(fruit2))
		{
			System.out.println("AND");
		}
		else if(num1==num2 || fruit1.equals(fruit2))
		{
			System.out.println("OR");
		}
		else if(num1!=num2 && !fruit1.equals(fruit2))
		{
			System.out.println("NONE");
		}
		
	}

}
/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

Example input/output:
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND

word1: banana 
word2: apple 
int1: 2 
int2: 2 
Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE*/