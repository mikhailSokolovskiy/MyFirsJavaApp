package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;
        long result = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(result);
            result = first + second;
            first = second;
            second = result;

        }
// реализация цикла с операторов цикла while
//        int i = 0;
//        while (i < count){
//            System.out.println(result);
//            result = first + second;
//            first = second;
//            second = result;
//            i++;
//        }
    }
}
