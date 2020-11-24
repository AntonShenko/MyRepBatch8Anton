package replS_It.repl_It_0to120;

class Main02 {
    String breed;
    String name;
    String color;

    public void bark(){
        System.out.println(breed + " can bark");
    }
    public void run(){
        System.out.println(breed + " can run");
    }
    public void play(){
        System.out.println(breed + " can play");
    }

}
public class ReplIt05 {
    public static void main(String[] args) {
        Main02 husky = new Main02();
        husky.breed = "husky";
        husky.name = "sli";
        husky.color = "white";
        husky.bark();
        husky.run();
        husky.play();

        Main02 bulldog = new Main02();
        bulldog.breed = "bulldog";
        bulldog.name = "sharic";
        bulldog.color = "black";
        bulldog.bark();
        bulldog.run();
        bulldog.play();

        Main02 labrador = new Main02();
        labrador.breed = "labrador";
        labrador.name = "piff";
        labrador.color = "brown";
        labrador.bark();
        labrador.run();
        labrador.play();


    }
}
