package replS_It.repl_It_121to170;

public class R143 {

    static String maxLength(String[] inpWords){
        String maxWord= "";

        for (int i = 1; i < inpWords.length; i++) {
            if(inpWords[i].length() > maxWord.length()){
                maxWord = inpWords[i];
            }
        }
        return maxWord;
    }
//words[+1].length()
    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
    }
}