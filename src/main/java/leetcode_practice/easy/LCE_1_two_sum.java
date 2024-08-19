package main.java.leetcode_practice.easy;

import java.util.Arrays;

public class LCE_1_two_sum {
    public static void main(String[] args) {
        int[]arr = {3,2,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
//                System.out.print(String.format("[%d+%d=%d]" ,i,j,nums[i]+nums[j]));
                if(nums[i]+nums[j]==target && i!=j) return new int[]{i,j};
            }
//            System.out.println();
        }
        return new int[]{-1, -1};
    }
}
