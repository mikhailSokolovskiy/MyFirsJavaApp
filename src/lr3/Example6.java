package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] nums;
        if (size > 0) {
            nums = new int[size];
        } else {
            System.out.println("Нельзя сделать массив с таким размером");
            return;
        }
        int count = 2;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = count;
            count += 5;
        }
        System.out.println(Arrays.toString(nums));
    }
}
