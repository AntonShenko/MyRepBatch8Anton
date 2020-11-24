package replS_It.repl_It_121to170;

public class R150 {

    String model;
    double price;
    int quantity;

    public R150(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
}
class MainR150
{

    static public void carStockValue(R150 [] amountOfItems) {
        for (int i = 0; i < amountOfItems.length; i++) {
            System.out.println(amountOfItems[i].model +" Stock Value "+ amountOfItems[i].price);

        }
    }
    static public void valueSum(R150 [] numOfCars){
        int quontCars = 0;
        int totalPrice = 0;
        int quantity = 0;
        for (int i = 0; i < numOfCars.length; i++) {
            quontCars ++;
            totalPrice += numOfCars[i].price;
            quantity += numOfCars[i].quantity;
        }
        System.out.println(quontCars+" " + totalPrice+" " + quantity);
    }
    public static void main(String[] args) {
        R150 [] stockCars = new R150[2];
        R150 car1 = new R150("Toyota 2019",2500000, 100);
        R150 car2 = new R150("BMW 2019",652980, 110);
        stockCars[0] = car1;
        stockCars[1] = car2;
        carStockValue(stockCars);
        valueSum(stockCars);

    }
}

