package replS_It.repl_It_121to170;

public class R158 {
    static private int age;

    static class A{
        public A() {
            System.out.println("I ");
        }
    }

    static class B extends A{
        public B(){
            System.out.println("am ");
        }
    }

    static class C extends B{
        public C(){
            System.out.println("a tester");
        }
    }

    public static void main(String[] args) {
    C c = new C();
    R158 cat = new R158();
    cat.setAge(20).setAge(30).setAge(40);
        System.out.println(age);
    }

    R158 setAge(int age){
        this.age = age;
        return this;
    }
}
