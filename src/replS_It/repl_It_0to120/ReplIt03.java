package replS_It.repl_It_0to120;

public class ReplIt03 {

    public static int sumEvenToX(int x){
        int y = 0;
        for (int i = 0; i < x; i+=2) {
            y += i;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenToX(5));
    }
}
