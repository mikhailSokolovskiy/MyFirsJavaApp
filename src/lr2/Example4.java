package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int val = in.nextInt();

        if ((val >= 5) & (val <= 10) ){
            System.out.println("Введенное число попадает в диапазон от 5 до 10 включительно");
        } else {
            System.out.println("Введенное число НЕ попадает в диапазон от 5 до 10 включительно");
        }
    }
}
