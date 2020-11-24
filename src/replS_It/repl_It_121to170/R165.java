package replS_It.repl_It_121to170;

class R165 {

    static class Main{
        String m1(){
            return "static method without parameter";
        }

        String m1(int i){
            return "static method with int parameter";
        }

        public static void main(String[] args) {
            Main main = new Main();
            System.out.println(main.m1());
            System.out.println(main.m1(1));
            //System.out.println(m1());
            //System.out.println(m1(1));
        }
    }
}
//Overload static method and then execute both overloaded methods.
//
//Expected Output:
//static method without parameter
//static method with int parameter