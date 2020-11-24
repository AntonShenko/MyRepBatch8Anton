package replS_It.repl_It_171to200;

public class R173a {

    static final double avgElements(int[] arr){
        double x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
        }
        return x/arr.length;
    }
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
