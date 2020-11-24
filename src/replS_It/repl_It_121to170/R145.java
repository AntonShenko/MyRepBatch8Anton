package replS_It.repl_It_121to170;

public class R145 {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public R145() {
    }

    public  R145(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
}

    class MainR145 {
        public static void main (String[] args){
            R145 print = new R145();
            System.out.println(print.schoolName+" " + print.batch+" " + print.year+" " + print.lastDayOfClass);

            R145 print2 = new R145("Syntax", 6, 2020, "07/30/2020");
            System.out.println(print2.schoolName+" " + print2.batch+" " + print2.year+" " + print2.lastDayOfClass);
        }
    }

