package replS_It.repl_It_121to170;

public class R152 {

    static class A {
        void pr() {
            System.out.println("Class A");
        }
    }

    static class B extends A {
        void pr() {
            System.out.println("Class B");
        }
    }


    public static void main(String[] args) {
        A print = new A();
        print.pr();

        B print2 = new B();
        print2.pr();
    }

}