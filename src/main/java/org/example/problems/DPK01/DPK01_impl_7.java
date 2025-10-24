package org.example.problems.DPK01;

public class DPK01_impl_7 {
    public static String revert(String input) {
        char[] chars = input.toCharArray();
        String invertedWord = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            invertedWord += input.charAt(i);
        }
        return invertedWord;
    }
    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}
