package replS_It.repl_It_121to170;

public class R169 {
     interface Animal{
        void eat();
        void sleep();
    }

    static class Cat implements Animal{
        String type;

        public Cat(String type) {
            this.type = type;
        }
        @Override
        public void eat() {
            System.out.println("Cat eats");
        }
        @Override
        public void sleep() {
            System.out.println("Cat sleeps a lot");
        }
    }

    static class Kitten1 extends Cat{
        public Kitten1(String type) {
            super(type);
        }
        @Override
        public void eat() {
            System.out.println("kitten1 eats milk");
        }
        @Override
        public void sleep() {
            System.out.println("kitten1 sleeps a lot");
        }
    }

    static class Kitten2 extends Cat{
        public Kitten2(String type) {
            super(type);
        }
        @Override
        public void eat() {
            System.out.println("kitten2 eats snacks");
        }
        @Override
        public void sleep() {
            System.out.println("kitten2 sleeps a lot");
        }
    }

    static class Kitten3 extends Cat{
        public Kitten3(String type) {
            super(type);
        }
        @Override
        public void eat() {
            System.out.println("kitten3 eats everything");
        }
        @Override
        public void sleep() {
            System.out.println("kitten3 sleeps a lot");
        }
    }

    static class Main{
        public static void main(String[] args) {
            Cat cat = new Cat("animal");
            Kitten1 kitten1 = new Kitten1("animal");
            Kitten2 kitten2 = new Kitten2("animal");
            Kitten3 kitten3 = new Kitten3("animal");

            Animal [] animals = {cat, kitten1, kitten2, kitten3};
            for (Animal anim:
                 animals) {
                anim.eat();
                anim.sleep();
            }
        }
    }
}
