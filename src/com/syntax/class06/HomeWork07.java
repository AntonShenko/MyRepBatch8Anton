package com.syntax.class06;
import java.util.Scanner;
public class HomeWork07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x;
		String name;
		String message;
		
		x=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name=x.nextLine();
		
		switch(name.toLowerCase())
		{
		case "asghar":
			message="Will take care of Java Assignment";
			break;
		case "moazam":
			message="Will take care of SDLC Assignment";
			break;
		case "wegas":
			message="Will take care of Selenium Assignment";
			break;
		case "asel":
			message="Will take care of every Assignment";
			break;
		default:
			message="Invalid";
		}	
	System.out.println(message);
			
		
		
	}

}
/*By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if the user provides any other names --> " Invalid ins*/