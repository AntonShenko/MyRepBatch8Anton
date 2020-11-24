package replS_It.repl_It_121to170;

public class R156 {

    static class Parent {
        public Parent() {
            System.out.println("This is parent constructor");
        }
    }

    static class Child extends Parent {
        public Child() {
        }
    }

    static class Main {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }
}