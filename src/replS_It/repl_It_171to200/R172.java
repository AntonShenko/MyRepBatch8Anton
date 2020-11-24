package replS_It.repl_It_171to200;

class R172 {
    final String reverceStr(String str){
        String resuls = "";
        for (int i = 0; i < str.length(); i++) {
            resuls = str.charAt(i) + resuls;
        }
        return resuls;

    }

    public static void main(String[] args) {
        R172 r172 = new R172();
        System.out.println(r172.reverceStr("hello"));
    }
}
