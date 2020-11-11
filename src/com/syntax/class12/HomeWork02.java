package com.syntax.class12;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.age = 100;
//		
		
		
		Book book2 = new Book();
		book2.age = 200;
		book2.name = "Money";
		
		System.out.println(book1.user.name);
		System.out.println(book2.name);
		
		
	}

}
	class Book {
		User user;
		String name;
		int age;
		public void print() {
			System.out.println(this);
		}
		
	}
	
	class User{
	
		String name;
		String model;
		
		public void contain() {
			
			
		}
		
	}