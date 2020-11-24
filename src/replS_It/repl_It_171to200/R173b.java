package replS_It.repl_It_171to200;

class R173b {
    public static void main(String[] args) {
        Main main = new Main();
        main.R173();
        main.R173("a");
    }
}

abstract class Parent{
    void R173(){}
    void R173(String str){}
}


class Main extends Parent{
    @Override
    void R173() {
        System.out.println("m1 without parameters");
    }

    @Override
    void R173(String str) {
        System.out.println("m1 method with parameter");;
    }
}