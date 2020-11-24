package replS_It.repl_It_171to200;

public class R176 {
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        main4.method1();
        main4.method2();
    }
}
interface MyInterface{
    void method1();
    void method2();
}

class Main4 implements MyInterface{

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");

    }
}
