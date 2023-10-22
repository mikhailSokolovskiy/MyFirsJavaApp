package timus.task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер билета (6 цифр)");
        int val = in.nextInt();

        if (String.valueOf(val).length() < 6){
            return;
        }

        int fst = (val / 1000);
        int snd = val % 1000;
        int sum1 = (fst % 10) + ((fst / 10) % 10) + (fst / 100);
        int sum2 = (snd % 10) + ((snd / 10) % 10) + (snd / 100);

        if (sum1 > sum2){
            snd += 1;
            sum2 = (snd % 10) + ((snd / 10) % 10) + (snd / 100);
        } else if (sum1 < sum2){
            snd -= 1;
            sum2 = (snd % 10) + ((snd / 10) % 10) + (snd / 100);
        } else if (sum1 == sum2){
            return;
        }


        if (sum1 == sum2){
            System.out.println("Yes");
        }else System.out.println("No");

    }

}
