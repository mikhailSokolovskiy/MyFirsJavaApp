package lr1;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String month = in.nextLine().toLowerCase();
        System.out.println("Введите количество дней в этом месяце: ");
        int dayCount = in.nextInt();

        switch (month) {
            case "январь", "март", "май", "июль", "август", "октябрь", "декабрь" ->
                    System.out.println(dayCount == 31 ? "Месяц содержит указанное количество дней" : "В месяце 31 день");
            case "апрель", "июнь", "сентябрь", "ноябрь" ->
                    System.out.println(dayCount == 30 ? "Месяц содержит указанное количество дней" : "В месяце 30 дней");
            case "февраль" ->
                    System.out.println(dayCount == (28 | 29) ? "Месяц содержит указанное количество дней" : "В месяце 28 дней или 29 в високосный год");
        }
    }
}
