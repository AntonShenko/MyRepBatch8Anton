package replS_It.repl_It_171to200;

public class R179 {
    public static void main(String[] args) {

        MainR179 mainR179 = new MainR179();
        mainR179.display(mainR179.adding(mainR179.getFirstNumber(), mainR179.getSecondNumber()));
        mainR179.display(mainR179.subtracting(mainR179.getFirstNumber(), mainR179.getSecondNumber()));
        mainR179.display(mainR179.multiply(mainR179.getFirstNumber(), mainR179.getSecondNumber()));
        mainR179.display(mainR179.dividing(mainR179.getFirstNumber(), mainR179.getSecondNumber()));

    }
}

interface Outputs{
    void display(double result);
}

interface Functions extends Outputs{
    double adding(double a, double b);
    double subtracting(double a, double b);
    double multiply(double a, double b);
    double dividing(double a, double b);
}

class MainR179 implements Functions{
    private double firstNumber = 100.00;
    private double secondNumber = 20.00;

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+ result);
    }
    @Override
    public double adding(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracting(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double dividing(double a, double b) {
        return a / b;
    }
}