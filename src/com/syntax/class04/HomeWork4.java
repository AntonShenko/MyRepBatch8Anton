package com.syntax.class04;
import java.util.Scanner;
public class HomeWork4 
{


		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

			Scanner inp = new Scanner(System.in);
		  	System.out.println("Please enter month number");
		  	int m = inp.nextInt();
		  	String txt="invalid";
		  	
			if (m==1) txt="January";			
			else if (m==2) txt="February";
			else if (m==3) txt="March";
			else if (m==4) txt="April";
			else if (m==5) txt="May";
			else if (m==6) txt="June";
			else if (m==7) txt="July";
			else if (m==8) txt="August";
			else if (m==9) txt="September";
			else if (m==10) txt="October";
			else if (m==11) txt="November";
			else if (m==12) txt="December";
			System.out.println(txt);
			
		}
}
	

