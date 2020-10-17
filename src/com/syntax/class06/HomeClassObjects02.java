package com.syntax.class06;

class Sample {
	int a;
	void myMethod() {
		System.out.println("Helo world");	
	}
	
	void myMethod2(int num) {
		System.out.println(num);	
	}
	
	void myMethod3() {
		a=99;
	}
	
}

public class HomeClassObjects02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample j; //создание указателя для хранения обькта созданного из класса Семпл
		j = new Sample(); //создание обьекта из класса Семпл. Запись адресса созданного обьекта в указатель J.
		j.a=15;
		
		Sample f;
		f = new Sample();
		f.a=30;
		
		System.out.println(j.a);
		System.out.println(f.a);
		
		j.myMethod();
		j.myMethod2(6);
		//j.myMethod3(); 
		f.myMethod3();
		System.out.println(f.a);
		
		System.out.println(j.a);
	}

}
