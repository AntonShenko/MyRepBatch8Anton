package com.syntax.vTesks;

public class Vtesk2 {
//02 Проверить простое ли число? (число называется простым, если оно делится только
//само на себя и на 1)
    public static boolean simpleNum(int num){

        if(num < 2)
            return false;
        else if (num % 2 == 0)
                return false;

        //boolean check = true;
        //for (int i = 2; i <=num; i++) {
        //    if(num % i == 0){
        //       check = false;
        //       break;
        //    }
        //}
        return true;
    }

    public static void main(String[] args) {

        System.out.println(simpleNum(12));
    }
}
