package myEx.polimorfism;

public class Main {

    public static void main(String[] args) {
        Circle cir = new Circle(10);
        Squere sq = new Squere(5, 10);


        Shape[] listOfShapes = {cir, sq /*,new Circle(5), new Squere(6, 8)*/};
        for (int i = 0; i < listOfShapes.length; i++) {
            if (listOfShapes[i] instanceof Circle) {
                //System.out.println(((Circle) listOfShapes[i]).color());
                System.out.println("This is Circle " + listOfShapes[i].s() + " and it has colore " + ((Circle) listOfShapes[i]).color());
            } else if (listOfShapes[i] instanceof Squere) {
                System.out.println("This is Squere " + listOfShapes[i].s() + " and it has colore " + ((Squere) listOfShapes[i]).color());
                ;

            }
        }

        //cir.s();
        //sq.s();

    }
}
