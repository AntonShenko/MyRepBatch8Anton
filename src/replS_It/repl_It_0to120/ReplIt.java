package replS_It.repl_It_0to120;

public class ReplIt {

    public static String censorLetter(String str, char simb){
        return str.replace(simb,'*');
    }

    public static void main(String[] args) {

        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("trick or treat",'t'));
    }
}
