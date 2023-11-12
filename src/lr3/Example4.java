package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int val1 = in.nextInt();
        int val2 = in.nextInt();
        int min = 0;
        int max = 0;
        if (val1 > val2) {
            min = val2;
            max = val1;
        }else if (val1 < val2) {
            min = val1;
            max = val2;
        }else System.out.println(val2);

        if (min > 0 || max > 0){
            for (int i = min; i <= max; i++ ){
                System.out.println(i);
            }
//            int i = min;
//            while (i <= max){
//                System.out.println(i);
//                i++;
//            }
        }

    }
}
