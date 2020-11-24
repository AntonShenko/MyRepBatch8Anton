package replS_It.repl_It_171to200;

class R178 {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.parentMethod();
        main2.childMethod();
    }
}

interface ParentInterface{
    void parentMethod();
}

interface ChildInterface extends ParentInterface{
    void childMethod();
}

class Main2 implements ChildInterface{

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}