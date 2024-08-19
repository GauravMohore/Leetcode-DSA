package main.java.dsa.sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_alg_merge_sort {
    public static void main(String[] args) {
        int[]l1 = {3,5,7};
        int[]l2 = {1,4,6,9};

//        System.out.println(Arrays.toString(addInfinity(l1)));
        System.out.println(Arrays.toString(merge(l1, l2)));

    }

    private static void mergeSort(int[]arr,int l,int r,int t){
        int m = l + (r-l)/2;
        if(l==r){ return;  }

    }

    private static int[] merge(int[]list1, int[]list2){
        int[]newList = new int[list1.length+list2.length];
        list1 = addInfinity(list1);
        list2 = addInfinity(list2);
        int i = 0, j=0, c=0;

        for(int k = 0; k<newList.length; k++){
            if(list1[i]==Integer.MAX_VALUE && list2[j]==Integer.MAX_VALUE){ break; }
            else if(list1[i]<list2[j]){
                newList[k] = list1[i];
                i++;
            }else{
                newList[k] = list2[j];
                j++;
            }
        }
        return newList;
    }

    private static int[] addInfinity(int[]arr){
        int[] inf = new int[arr.length+1];
        inf[inf.length-1] = Integer.MAX_VALUE;
        System.arraycopy(arr, 0, inf, 0, inf.length - 1);
        return inf;
    }
}