package main.java.dsa.searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Search_alg_linear_search {
    public static void main(String[] args) {
        int[]givenArray = {5,7,2,3,12,7,9};

        System.out.println("Given array: " + Arrays.toString(givenArray));

        System.out.println("target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        System.out.println("index: " + linearSearch(givenArray,12));
    }

    // Time complexity = O(N)
    private static int linearSearch(int[]array, int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target) return i;
        }
        return -1;
    }
}
