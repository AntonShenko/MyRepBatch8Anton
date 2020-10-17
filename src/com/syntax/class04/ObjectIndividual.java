package com.syntax.class04;


class Player
{
	int health;
	
	void print() 
	{
		System.out.println("Hello, my health level: "+health);
	}
}

public class ObjectIndividual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p;	//создание указателя для хранения обьекта Player.
		p=new Player(); //создание нового обьекта Player и запись его адреса в указатель "p".
		p.health=70;
		p.print();
		
		Player p2;
		p2=new Player();
		p2.health=80;
		p2.print();
		
		Player p3;
		p3=p2;
		p3.print();
		
		
	}

}
