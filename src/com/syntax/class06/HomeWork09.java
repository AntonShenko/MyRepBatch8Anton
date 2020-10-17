package com.syntax.class06;

import java.util.Scanner;

public class HomeWork09 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner x;
		int roll;
		String student;
		
		x=new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		roll=x.nextInt();
		
		switch (roll)
		{
		case 101:
			student="Student name: Ramesh";
			break;
		case 102:
			student="Student name: Mahesh";
			break;
		case 103:
			student="Student name: Mukesh";
			break;
		default:
			student="Not found Student name: in Class";
		}
		{
		System.out.println(student);
		}
	}
}

/*for you to do:
Write a program using the switch statement  
Let us consider there are three students in the class with roll number  starting from (101 to 103) if any number other than 101-103 are present display "Not found Student name: in Class"

First Output: "enter the roll number of the Child"

case 101: if roll number is 101 print as "Student name: Ramesh "

case 102 :if roll number is 102 print as "Student name: Mahesh "

case 103:if roll number is 103 print as "Student name: Mukesh "

Other than this roll number  it should print "Not found Student name: in Class"*/