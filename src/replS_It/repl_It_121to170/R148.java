package replS_It.repl_It_121to170;

public class R148 {

    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    public R148(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
}
class MainR148 {
    public static void main(String[] args) {
        R148 dog1 = new R148("Tarzan", 50);
        System.out.println(dog1.dogName+" " + R148.dogBreed+" " + dog1.dogWeight);
        R148 dog2 = new R148("Lucy", 10);
        System.out.println(dog2.dogName+" " + R148.dogBreed+" " + dog2.dogWeight);
    }
}

