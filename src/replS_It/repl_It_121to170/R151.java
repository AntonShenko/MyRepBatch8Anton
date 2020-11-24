package replS_It.repl_It_121to170;

public class R151 {

    String item;
    double price;
    int quantity;

    public R151(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
}
class MainR151 {

    static void itemTotalPrice(R151 [] products) {
        double sum = 0;
        for (R151 s:
             products) {
            sum += s.price;
        }
        System.out.println("You purchased " +sum+ " Today");

    }


        public static void main(String[] args) {
        R151 obj1 = new R151("Blanket", 99.98, 1);

        R151 obj2 = new R151("Mattress", 439.18, 1);
            System.out.println(obj1.item+" Total Value " + obj1.price);
            System.out.println(obj2.item+" Total Value " + obj2.price);

        R151[] products = new R151[2];
        products[0] = obj1;
        products[1] = obj2;
        itemTotalPrice(products);
        //static
            //методы или свойства которые стат можно вызывать без созд обьекта.
            //эти методы и свойства сущ в ед эксземпляре, и только можно можно перезаписать.
        //public
            //если убрать слово public метолд станвится дефолтныфй.
    }
}
