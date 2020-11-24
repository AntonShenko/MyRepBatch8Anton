package replS_It.repl_It_121to170;

public class R168 {
    static class Parent{
        void hello(){
            System.out.println("method in Parent class");
        }
    }
    static class Child1 extends Parent{
        @Override
        void hello() {
            System.out.println("method in Child1 class");
        }
    }
    static class Child2 extends Parent{
        @Override
        void hello() {
            System.out.println("method in Child2 class");
        }
    }
    static class Child3 extends Parent{
        @Override
        void hello() {
            System.out.println("method in Child3 class");
        }
    }
    static class Main{
        public static void main(String[] args) {
            Child1 child1 = new Child1();
            child1.hello();

            Child2 child2 = new Child2();
            child2.hello();

            Child3 child3 = new Child3();
            child3.hello();
        }
    }
}
