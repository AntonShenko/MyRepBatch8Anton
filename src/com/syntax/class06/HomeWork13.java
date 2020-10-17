package com.syntax.class06;
import java.util.Scanner;
public class HomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner yourCar;//создание указателя для хранения обькта созданного из класса Scanner
		String carName;
		String message;
		
		yourCar = new Scanner(System.in);//создаю обьект класса сканер и записываю в указатель адрес этого обьекта
		System.out.println("Please enter your favorite car make");
		carName = yourCar.nextLine();//из указателя вызываем метод некст лайн
		
		String tmp = carName.toUpperCase();
		
		
		switch (tmp)//использую оператор языка и перендаю ему на вход один параметр.
		{
		case "BMW":
			message = " german car";
			break;
		case "TOYOTA":
			message =  " japanese car";
			break;
		case "MASERATI":
			message = " italian car";
			break;
		default:
			message = "unknown";
		}
			System.out.println("Your favorite car is"+message);

	}

}
/*For you to do: 
Prompt user with questions: "Please enter your favorite car make"

if user enters  BMW -->  carOrigin = "german car"
if user enters  Toyota -->  carOrigin = " japanese car"
if user enters  Maserati -->  carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown" 
 
The output of your program should be:
"Your favorite car is ___"*/