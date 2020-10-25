package com.syntax.class11;

public class ClassWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = 0; 
		int size = 0;
		int[] array = {10, 0, 20, 8, -1, 77, 56,};
		
		largest = array[0];
		 
        for (int i = 1; i <array.length; i++) 
        {
            if (largest < array[i])
            largest = array[i];
        }
 
        System.out.println("largest array is : " + largest);
 
	}

}
