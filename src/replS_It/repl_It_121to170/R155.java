package replS_It.repl_It_121to170;

public class R155 {
    String city;

    public R155(String city) {
        this.city = city;
    }

    public R155() {
        System.out.println("Parent Constructor");
    }
}

class ChildR155 extends R155{
    ChildR155(String city){
        super(city);
    }
}

class MainR155 {
    public static void main(String[] args) {
        ChildR155 child = new ChildR155("Vienna");
        System.out.println(child.city);
    }

}
