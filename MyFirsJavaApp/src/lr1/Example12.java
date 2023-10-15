package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        System.out.println("Вы родились в: " + (2023 - in.nextInt()) + "году");
    }
}
