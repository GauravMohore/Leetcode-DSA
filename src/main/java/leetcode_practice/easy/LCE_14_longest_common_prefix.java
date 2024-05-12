package main.java.leetcode_practice.easy;

import java.util.Arrays;

public class LCE_14_longest_common_prefix {
    public static void main(String[] args) {
        String[]givenArray = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(givenArray));
    }

    //-solution-----------------------------------------------------

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                break;
            }
            commonPrefix.append(strs[0].charAt(i));
        }
        return commonPrefix.toString();
    }
}
