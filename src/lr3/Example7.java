package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        char [] nums;
        if (size > 0) {
            nums = new char[size];
        } else {
            System.out.println("Нельзя сделать массив с таким размером");
            return;
        }
        char symbol = 'a';
        for (int i = 0; i < nums.length; i++){
            nums[i] = symbol;
            symbol += 2;
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        for (int i = nums.length - 1 ; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
