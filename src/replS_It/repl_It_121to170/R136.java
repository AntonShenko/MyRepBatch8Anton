package replS_It.repl_It_121to170;

public class R136 {

    static int countA(String s) {

        int charCount = 0;
        String a = "";
        s = s.toLowerCase().replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
            charCount ++;
           a += s.charAt(i);//образец
            }
        }
        return charCount;
    }
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
