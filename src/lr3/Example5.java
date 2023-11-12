package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int amount = in.nextInt();
        int num = 0;
        int sum = 0;
        System.out.println("Введите числа для суммы");
        for (int i = 0; i < amount; i++){
            num = in.nextInt();
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
            }
        }

//        int i = 0;
//        while (i < amount) {
//            num = in.nextInt();
//            if (num % 5 == 2 || num % 3 == 1) {
//                System.out.print(num + " ");
//                sum += num;
//            }
//            i++;
//        }

        System.out.println();
        System.out.println("Сумма введенных чиссел удовлетворяющих условиям равно: " + sum);


    }
}
