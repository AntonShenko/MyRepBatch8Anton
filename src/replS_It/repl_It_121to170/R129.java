package replS_It.repl_It_121to170;

public class R129 {

     static int numOfInstance = 0;

    R129() {
        numOfInstance++;
    }
    public static void main(String[] args) {
        R129 o1 = new R129();
        R129 o2 = new R129();
        R129 o3 = new R129();
        //o2.numOfInstance = 10;
        //System.out.println(o2.numOfInstance);
        System.out.println(numOfInstance);
    }
}
