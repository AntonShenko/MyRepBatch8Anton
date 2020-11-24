package replS_It.repl_It_171to200;

public class R174 {
    public static void main(String[] args) {
        Main3 main3 = new Main3();
        main3.m1();
        main3.m2();
    }
}

abstract class Parent2{
    void m1(){
    }
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}

class Main3 extends Parent2{
    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }

    @Override
    void m2() {
        super.m2();
    }
}

