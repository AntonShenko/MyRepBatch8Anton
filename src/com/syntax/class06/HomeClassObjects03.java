package com.syntax.class06;

class Practice {
	int a;
	String b;
	
	void method1() {
		System.out.println("It works");
	}
	
	void method2(int n) {
		System.out.println(n/10);	
	}
	
	int method3(int n) {
		return n*100;
	}
	
	void method4() {
		a = 99;
	}
	void method5(int z) {
		a = z;
	}
}
public class HomeClassObjects03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice num1;
		Practice num2;
		Practice num3;
		
		num1 = new Practice();
		num2 = new Practice();
		num3 = new Practice();
		
		num1.method4();
		num3.method5(50);
		
		System.out.println(num1.a);
		System.out.println(num2.a);
		System.out.println(num3.a);

	}

}


/*Название класса: "Practice"
Поля: "a" - целое число, "b" - строка

Методы:
1)
Название: "method1"
Возвращаемое значение: нету
Получаемые параметры: нету
Что делает: выводит на консоль строку "It works!"
2)
Название: "method2"
Возвращаемое значение: нету
Получаемые параметры: число
Что делает: выводит на консоль полученное число разделённое на 10
3)
Название: "method3"
Возвращаемое значение: число
Получаемые параметры: число
Что делает: возвращает результатом полученное число умноженное на 100
4)
Название: "method4"
Возвращаемое значение: нету
Получаемые параметры: нету
Что делает: в поле "a" записать число 99
5)
Название: "method5"
Возвращаемое значение: нету
Получаемые параметры: число
Что делает: в поле "a" записывает полученное число*/