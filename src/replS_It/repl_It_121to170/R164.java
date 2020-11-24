package replS_It.repl_It_121to170;

public class R164 {
    public static class Main {

        String str;

        private String m1() {
            return "private m1 method";
        }

        private String m1(int a) {
            return "private m1 method with int parameter";
        }

        public static void main(String[] args) {
            Main main = new Main();
            System.out.println(main.m1());
            System.out.println(main.m1(1));
        }
    }
}
//Overload private instance method m1
//
//Call each method from the main method.
//
//Expected Output:
//private m1 method
//private m1 method with int parameter