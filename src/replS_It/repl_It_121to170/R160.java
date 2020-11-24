package replS_It.repl_It_121to170;

public class R160 {
    static class Parent {
        void m1() {
            System.out.println("m1 method in parent class");
        }
    }
    static class Child extends Parent{
        public void m1(){
            System.out.println("m1 method in child class");
        }

        public void m2(){
            m1();
            Parent parentm1 = new Parent();
            parentm1.m1();
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.m2();
    }
}