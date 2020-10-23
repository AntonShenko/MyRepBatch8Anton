package com.syntax.class09;

public class HomeWork07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = new int[5];
		
		arr[0] = 20;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 50;
		
		int acc = 0;
	
		
        for (int i=0; i<5; i++)
        {
            acc += arr[i];
        }
        System.out.println(acc/5);
	}

}
