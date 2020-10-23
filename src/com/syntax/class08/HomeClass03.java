package com.syntax.class08;
import java.util.Scanner;
public class HomeClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	     int x = 0;
	     int y = 0;
	     System.out.println("please enter first number of a range: ");
	     x = inp.nextInt();
	     System.out.println("please enter second number of a range: ");
	     y = inp.nextInt();
	     int j = 0;
	     int q = 0;
	     
	     if(y<x)
	     {
	    	 return;
	     }
	     
	     for(int i=x; i<=y; i++)	 
	     {
	    	 if(i%2!=0)
	    	 {
	    		 j += i;
	    	 }
	    	 else
	    	 {
	    		 q += i;
	    	 }
	    	 
	     }
	     System.out.println("sum odd numbers: " + j+ "");
	     System.out.print("sum even numbers: " + q+ "");
	}

	}
//System.out.println("sum of range: " + i);
