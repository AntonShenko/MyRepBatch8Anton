package com.syntax.class06;

class Player1 {
	
	String name;
	int health;
	private int level;
	
	String getInfo() 
	{
		return name+" "+health+" "+level;	
	}
	
	void setLevel(int l) 
	{
		if(l<10)
		{
			level = l;
		}
	}
	void setHealth(int h) 
	{
		if(h<100)
		{
			health = h;
		}
		else
		{
			health = 100;
		}
	}
	
	int buyAmmo(int money) 
	{
		return money/10;		
	}
	
}
public class HomeClassObjects01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Player1 x;
			x = new Player1();
			x.name = "Joseph";
			x.setHealth(70);
			x.setLevel(11);
			
			Player1 y;
			y = new Player1();
			y.name = "James";
			y.setHealth(500);
			y.setLevel(7);
		
			
			String msg = x.getInfo();
			
			System.out.println(msg);
			System.out.println(y.getInfo());
			//System.out.println(y.name.length()); 
			
			int by = x.buyAmmo(150);
			
			System.out.println(by);
	}

}
