package com.syntax.class11;

public class ClassWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] names= {
				{"Mr", "Mrs", "Ms", "Miss",},
				{"Smith", "Jordan", "Jackson", "Obama",}
				};
		
		System.out.println(names[0][1] +
                names[1][0]);
     
	      System.out.println(names[0][0] +
	                names[1][1]);
	     
	      System.out.println(names[0][2] +
	                names[1][2]);
	     
	      System.out.println(names[0][3] +
	                names[1][3]);
			
		
	System.out.println("-------------------------------------------");


	String [][] cars= {
			{"ford","gmc"},
			{"mercedes","audi"},
			{"kia","hyundai"},
			{"alfaRomeo","maserati"}
			};
	
	for(int  row=0;row<cars.length;row++) {
		for(int col=0;col<cars[row].length;col++) {
			System.out.print(cars[row][col]+" ");
		}
		System.out.println();	}
}
}
/*Create a 2D array where you will store the following values:
 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.*/