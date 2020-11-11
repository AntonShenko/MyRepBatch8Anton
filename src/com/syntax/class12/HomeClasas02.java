package com.syntax.class12;

public class HomeClasas02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		int n=0;
					
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length; c++) {
				if(a[r][c]<0 && a[r][c]%2!=0) {
					n++;
				}
			}			
		}
		System.out.println(n);			

	}

}
