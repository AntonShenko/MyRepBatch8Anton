package com.syntax.class11;

public class Tesk09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countries = { 
				{ "USA", "Canada", "Mexico" }, 
				{ "Brazil", "Colombia", "Argentina" },
				{ "France", "Germany", "Italy", "Spain" }, 
				{ "Japan", "South Korea", "Uzbekistan", "India" },
				{ "Nigeria", "Kenya", "Morocco", "Senegal" } 
				};
		
		for(String[] countArray : countries) {
			for(String country : countArray) {
				System.out.print(country+" ");
			}
			System.out.println();
		}
	}
}
