package main.java.leetcode_practice.easy;

import java.util.Arrays;

public class LCE_35_search_insert_position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,11,12};
        System.out.println(searchInsert(arr,10));
    }

    private static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        int mid = 0;

        while(last>=first){
            mid = first + (last-first)/2;
            if(target>nums[mid]) first = mid+1;
            else if (target<nums[mid]) last = mid-1;
            else return mid;
        };
        return target>nums[mid]? mid + 1 : mid;
    }
}
