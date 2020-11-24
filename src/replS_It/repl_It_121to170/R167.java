package replS_It.repl_It_121to170;

     class ParentU {
        public void methodA() {
            System.out.println("I am a child public method");
        }

        protected void methodB() {
            System.out.println("I am a child protected method");
        }

        void methodC() {
            System.out.println("I am a child default method");
        }

        private void methodD() {
            System.out.println("I am a child private method");
        }

    }

     class ChildU extends ParentU {
        @Override
        public void methodA() {
            super.methodA();
        }

        @Override
        protected void methodB() {
            super.methodB();
        }

        @Override
        void methodC() {
            super.methodC();
        }
    }

public class R167 {
        public static void main(String[] args) {
            ChildU child = new ChildU();
            child.methodA();
            child.methodB();
            child.methodC();
        }
    }

