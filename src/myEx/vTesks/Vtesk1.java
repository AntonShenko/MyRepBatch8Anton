package myEx.vTesks;

public class Vtesk1 {

    //01. Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        for (int i = 0; i <=100 ; i+=2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
