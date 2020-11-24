package replS_It.repl_It_0to120;

import java.util.Scanner;

public class ReplIt98 {
    public static void main(String[] args) {

        //098
        String str = "Hello Syntax friends";
        System.out.println(str.replaceAll("Hello Syntax friends", "Welcome Syntax family"));


        //099
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String givenString = inp.nextLine();
        givenString = givenString.toLowerCase().replace(" ", "");
        String reverse = "";
        for (int i = 0; i < givenString.length(); i++) {
            reverse = givenString.charAt(i) + reverse;
        }
        for(int i=givenString.length()-1; i>=0; i--){
            reverse = reverse + givenString.charAt(i);
        }
        boolean palindrome = true;
        for (int j = 0; j < givenString.length(); j++) {
            if(givenString.charAt(j) != reverse.charAt(j)){
                palindrome = false;

            }
        }
        if(palindrome){
            System.out.println(palindrome);
        }
        else {
            System.out.println(palindrome);
        }
    }
}
