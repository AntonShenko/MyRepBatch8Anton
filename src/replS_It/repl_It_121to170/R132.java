package replS_It.repl_It_121to170;

public class R132 {
//???

    public static String mixString(String s1, String s2){
        String x = "";
        for (int i = 0; i < s1.length(); i++) {
           x += s1.charAt(i);
           x += s2.charAt(i);
        }

        return x;
    }

    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
