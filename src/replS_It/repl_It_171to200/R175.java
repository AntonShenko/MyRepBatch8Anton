package replS_It.repl_It_171to200;

public class R175 {
    public static void main(String[] args) {
        LeamonTea leamonTea = new LeamonTea("Lemon Tea");
        ChaiTea chaiTea = new ChaiTea("Chai Tea");
        Tea [] teas = {leamonTea, chaiTea};
        for (Tea allTee:
             teas) {
            allTee.addSugar();
        }
    }
}
abstract class Tea{
    String teaType;

    public Tea(String teaType) {
        this.teaType = teaType;
    }
    abstract void addSugar();
}

class LeamonTea extends Tea{

    public LeamonTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar() {
        System.out.println("For " + teaType +" we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea{

    public ChaiTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar() {
        System.out.println("For " + teaType +" we need 1 spoon of sugar");
    }
}