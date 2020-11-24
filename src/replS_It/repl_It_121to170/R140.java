package replS_It.repl_It_121to170;

public class R140 {

    String name = "Jogn";
    private String city = "Miami";
    public String nameOfSchool = "Syntax";
    protected String batchNum = "batch 6";

    String str(){
        return "My name is " + name + " and I live in " + city + ". I Study at " + nameOfSchool + " in " + batchNum;
    }

    public static void main(String[] args) {
        R140 print = new R140();
        System.out.println(print.str());
    }
    }

