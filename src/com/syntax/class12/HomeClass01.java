package com.syntax.class12;

public class HomeClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int sum=0;
		for(int r=0; r<a.length; r++) {
			if(r%2==0) {	
				for(int c=0; c<a[0].length; c++) {
					if(c%2==0) {
						sum = sum + a[r][c];
					}
				}
			}
		}
		System.out.println(sum);
	}

}
