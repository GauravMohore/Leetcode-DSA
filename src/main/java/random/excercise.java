package main.java.random;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class excercise {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1,10).toArray();
//        crazyPattern(arr,7);
    }

    private static void crazyPattern(int[]arr, int target){
        int l = 0;
        int r = arr.length-1;

        System.out.println(Arrays.toString(arr));

        while(l<=r){
            int m = l + (r-l)/2;

            if(arr[m]>target) r = m-1;
            else if(arr[m]<target) l = m+1;
            else {
                System.out.println(m);
                break;
            }
        }
    }

}
