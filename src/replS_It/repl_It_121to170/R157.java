package replS_It.repl_It_121to170;

public class R157 {
    int num;
    public R157() {
        System.out.println("Parent Constructor without argument");
    }
    public R157(int num) {
        this.num = num;
    }
}

class Child extends R157 {
    public Child() {
        System.out.println("Child Constructor without argument");
    }
    public Child(int num){
        super(num);
    }
}

class MainR157 {
    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child(10);
        System.out.println(child2.num);
    }
}