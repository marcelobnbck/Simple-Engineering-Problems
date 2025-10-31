package org.example.problems.DPK01;

public class DPK01_impl_3 {

    public static String revert(String input) {
        char[] chars = input.toCharArray();
        String Word = "";
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            Word = Word + chars[left];
            left = left + 1;
            right = right - 1;
        }
        return Word;
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }

}
