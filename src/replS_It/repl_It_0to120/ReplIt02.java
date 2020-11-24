package replS_It.repl_It_0to120;

public class ReplIt02 {
    public static String spaceOut(String str){
       return  str.replace("", " ");

    }

    public static void main(String[] args) {

        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
}
}