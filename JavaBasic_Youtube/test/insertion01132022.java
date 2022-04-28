package test;

import java.util.Arrays;

public class insertion01132022 {
    public static int[] insertion(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {11111,2,34,243,534};
        System.out.println(Arrays.toString(nums));
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
}

