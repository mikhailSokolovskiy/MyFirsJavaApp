package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения: ");
        System.out.println("Ваш возраст: " + (2023 - in.nextInt()));
    }
}
