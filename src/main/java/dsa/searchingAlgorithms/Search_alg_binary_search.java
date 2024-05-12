package main.java.dsa.searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Search_alg_binary_search {
    public static void main(String[] args) {
        int[]givenArray = {5,7,2,3,12,7,9};
        Arrays.sort(givenArray);

        System.out.println("Given array: " + Arrays.toString(givenArray));

        System.out.println("target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        System.out.println("index (iterative solution): " + binarySearch(givenArray,target));
        System.out.println("index (recursive solution): " + binarySearch(givenArray,0,givenArray.length-1,target));
    }

    // Iterative
    private static int binarySearch(int[]sortedArray,int target){
        int left = 0;
        int right = sortedArray.length-1;

        while(right>=left){
            int mid = left + (right - left) / 2;
            if(target==sortedArray[mid]){
                return  mid;
            } else if (target>sortedArray[mid]) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    // Recursive
    private static int binarySearch(int[]sortedArray,int left, int right, int target){
        int mid = left + (right - left) / 2;
        if(right<left){
            return -1;
        } else if (target==sortedArray[mid]){
            return mid;
        }else{
            if(target>sortedArray[mid]) left = mid+1;
            else right = mid-1;
            return  binarySearch(sortedArray,left,right,target);
        }
    }
}
