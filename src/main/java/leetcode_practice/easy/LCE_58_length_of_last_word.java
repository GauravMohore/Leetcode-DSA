package main.java.leetcode_practice.easy;

public class LCE_58_length_of_last_word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        String []array = s.trim().split(" ");
        return array[array.length-1].length();
    }
}
