package com.syntax.class11.polimorfism2;

public class CreditCard {

    double amountOfMoney;
    double bankInterest;


    public CreditCard(double amountOfMoney, double bankInterest) {
        this.amountOfMoney = amountOfMoney;
        this.bankInterest = bankInterest;
    }

    public double calkMoney(){
        return amountOfMoney * bankInterest;
    }
}
class Visa extends CreditCard{

    public Visa(double amountOfMoney, double bankInterest) {
        super(amountOfMoney, bankInterest);
    }

    @Override
    public double calkMoney() {
        return super.calkMoney();
    }
}

class AX extends CreditCard{

    @Override
    public double calkMoney() {
        return super.calkMoney()+1.001;
    }

    public AX(double amountOfMoney, double bankInterest) {
        super(amountOfMoney, bankInterest);


    }
}

class Main{
    public static void main(String[] args) {
        Visa visaMeth = new Visa(1000, 1.002);
        System.out.println(visaMeth.calkMoney());

        AX axMeth = new AX(1000, 1.002);
        System.out.println(axMeth.calkMoney());
    }
}