package com.syntax.class06;

class Player {
	
	String name;
	int health;
	int level;

	
	
	
}


public class HomeClassOpjects {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p;
		p = new Player();
		p.name = "Micle";
		p.health = 100;
		p.level = 5;
		
		Player y;
		y = new Player();
		y.name = "James";
		y.health = 100;
		y.level = 7;
		
		Player z;
		z = y;
		z.level = 99;
		
		z = p;
		z.level = 78;
		
		System.out.println(p.name+" "+y.name);
		System.out.println(p.level+" "+y.level);
		
		
	}

}
