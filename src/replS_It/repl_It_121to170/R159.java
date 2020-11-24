package replS_It.repl_It_121to170;

class R159 {
    static class A{
        int i;
        void A() {
            this.i = 10;
            System.out.println(i);
        }
    }

    static class B extends A {
        @Override
        void A() {
            System.out.println(this.i = 20);
            super.A();
        }
    }
    public static void main(String[] args) {
        B b = new B();
        b.A();
    }
}
