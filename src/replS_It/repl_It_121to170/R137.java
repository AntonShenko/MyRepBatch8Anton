package replS_It.repl_It_121to170;

public class R137 {

    static int countVowels(String s){
        String ch = "";
        int v = 0;
        ch =s.toLowerCase().replaceAll("[^AEIOUaeiou]", "" ).replace(" ", "");
        for (int i = 0; i < ch.length(); i++) {
            v ++;
        }
        return v;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
