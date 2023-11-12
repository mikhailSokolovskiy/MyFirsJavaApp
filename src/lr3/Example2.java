package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String val = in.nextLine().toLowerCase();

        switch (val){
            case "понедельник":
                System.out.println("Порядковый номер введенного дня недели - " + 1);
                break;
            case "вторник":
                System.out.println("Порядковый номер введенного дня недели - " + 2);
                break;
            case "среда":
                System.out.println("Порядковый номер введенного дня недели - " + 3);
                break;
            case "четверг":
                System.out.println("Порядковый номер введенного дня недели - " + 4);
                break;
            case "пятница":
                System.out.println("Порядковый номер введенного дня недели - " + 5);
                break;
            case "суббота":
                System.out.println("Порядковый номер введенного дня недели - " + 6);
                break;
            case "воскресение":
                System.out.println("Порядковый номер введенного дня недели - " + 7);
                break;
            default:
                System.out.println("Нет такого дня недели");
                break;
        }
    }
}
