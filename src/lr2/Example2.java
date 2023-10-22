package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int val = in.nextInt();

        if ((val % 5 == 2) & (val % 7 == 1) ){
            System.out.println("Введенное число удовлетворяет критерию (при делении на 5 в остатке\n" +
                    "получается 2, а при делении на 7 в остатке получается 1)");
        } else {
            System.out.println("Введенное число НЕ удовлетворяет критерию (при делении на 5 в остатке\n" +
                        "получается 2, а при делении на 7 в остатке получается 1)");
        }
    }
}
