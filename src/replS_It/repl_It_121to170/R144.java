package replS_It.repl_It_121to170;

public class R144 {

    public static int maxValue(int[] inputArr){
        int maxV = inputArr[0];
        for (int i = 1; i < inputArr.length; i++) {
            if(inputArr[i] > maxV) {
                maxV = inputArr[i];
            }
        }
        return maxV;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
