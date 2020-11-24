package replS_It.repl_It_121to170;

public class R134 {

    static String thirdLetter(String s){
        String x = "";
        for(int i=0; i<s.length(); i+=3){
            x += s.charAt(i);
        }
        return x;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

