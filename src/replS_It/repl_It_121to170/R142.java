package replS_It.repl_It_121to170;

public class R142 {

    static String alphabetical(String str){
        String returnStr = "";

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) <= str.charAt(i-1)){
                returnStr += str.charAt(i-1);
            }
        }
        return returnStr;
    }

    //test case below (dont change):
    public static void main(String[] args){


        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
