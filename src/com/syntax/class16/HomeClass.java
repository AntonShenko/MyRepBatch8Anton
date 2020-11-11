package com.syntax.class16;

public class HomeClass {

    public static String strWeekName(int weekNum){
        String[] week = {"Mon", "Tue", "Wed", "Thu"};
        return week[weekNum-1];
    }

    //next
    public static String returnStringNum(int num){
        String[] num0to9 = {"zero", "one", "two", "tree", "four", "five", "six", "seven", "eight", "nine"};
        String[] num10to90 = {"","", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String fullNum = num10to90[num/10]+" " + num0to9[num%10];//36
        return fullNum;
    }

    //same
    public static void numSeparation(int num){
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num = num/10;
        }
    }

    public static void main(String[] args) {
        System.out.println(strWeekName(2));

    //next
        System.out.println(returnStringNum(5));
        System.out.println(returnStringNum(36));

        numSeparation(123);
    }
}
