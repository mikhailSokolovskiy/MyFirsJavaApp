package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        int first = a - 1;
        int sec = a + 1;
        System.out.print(first + ",");
        System.out.print(a + ",");
        System.out.print(sec + ",");
        System.out.println(Math.pow(a+first+sec, 2));


    }
}
