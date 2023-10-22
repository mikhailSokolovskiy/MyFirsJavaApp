package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int val = in.nextInt();

        if ((val % 4 == 0) & (val >= 10) ){
            System.out.println("Введенное число удовлетворяет критерию (число делится на 4 и не меньше 10)");
        } else {
            System.out.println("Введенное число НЕ удовлетворяет критерию (число делится на 4 и не меньше 10)");
        }
    }


}
