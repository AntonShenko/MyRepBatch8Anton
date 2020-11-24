package replS_It.repl_It_0to120;

import java.util.Scanner;

public class ReplIt100 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        s = s.replace(" ", "");

        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        System.out.println(rev);

    }
}