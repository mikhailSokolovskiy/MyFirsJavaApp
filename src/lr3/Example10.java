package lr3;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        Integer[] nums = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }
        Arrays.sort(nums);
        System.out.println("Массив по порядку: " + Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Массив по в обратном порядке: " + Arrays.toString(nums));
    }
}
