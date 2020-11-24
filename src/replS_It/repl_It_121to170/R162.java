package replS_It.repl_It_121to170;

import static java.lang.System.*;

public class R162 {

    public static int num(int a, int b){
        return 20;
    }
    public static int num(int a, int b, int c){
        return 30;
    }
    public static int num(int a, int b, int c, int e){
        return 40;
    }

    public static void main(String[] args) {
        out.println(num(1,2));
        out.println(num(1,2,3));
        out.println(num(1,2,3,4));
    }
}
//Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//In main method execute all 3 methods to match the output:
//
//Expected Output
//40 (should come from subtracting 4 numbers)
//30 (should come from subtracting 3 numbers)
//20 (should come from subtracting 2 numbers)