package replS_It.repl_It_171to200;

public class R177 {
    public static void main(String[] args) {
        Main5 main5 = new Main5();
        main5.firstMethod();
        main5.secondMethod();
    }
}
interface FirstInterface{
    void firstMethod();
}
interface SecondInterface extends FirstInterface{
    void secondMethod();
}

class Main5 implements SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}