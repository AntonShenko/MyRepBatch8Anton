package com.syntax.class11;

import java.util.Scanner;

public class Tesk08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[][] nums = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20,},
				{21,22,23,24,25,26,27,28,29,30,}				
				};
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(nums[i][j]%2==0)
				sum = sum + nums [i][j];
				
			}
		}
		System.out.println(sum);
		
	}	
}

