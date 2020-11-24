package replS_It.repl_It_121to170;

public class R139 {

    private static String priv(){
        return "This is Private Method";
    }

    static String def(){
        return "This is Default Method";
    }

    protected static String prot(){
        return "This is Protected Method";
    }

    public static String stat(){
        return "This is Public Method";
    }

    public static void main(String[] args) {
        System.out.println(priv());
        System.out.println(def());
        System.out.println(prot());
        System.out.println(stat());
    }
}
