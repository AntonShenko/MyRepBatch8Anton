package replS_It.repl_It_121to170;

class R166 {
    static class Parent {
        void method() {
            System.out.println("Parent method");
        }
    }
    static class Child extends Parent {
        @Override
        void method() {
            super.method();
            System.out.println("Child method");
        }
    }
    static class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.method();
        }
    }
}

//In Parent Class create a method with name method() that will print  "Parent method"
//
//Override method() in Child class that will print "Child method"
//
//In Main Class create objects of child and parent class and call its method.
//
//Expected Output:
//!!!Parent method
//!!!Child method