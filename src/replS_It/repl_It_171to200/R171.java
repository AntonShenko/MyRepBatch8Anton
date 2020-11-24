package replS_It.repl_It_171to200;

class R171 {
    final void R171(Boolean x){
        System.out.println("Final method with boolean parameter");
    }
    final void R171(String str){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        R171 r171 = new R171();
        r171.R171(true);
        r171.R171("str");
    }
}
