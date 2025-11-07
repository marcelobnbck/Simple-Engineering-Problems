package org.example.problems.DPK01;

public class DPK01_impl_3 {
    public static String revertOnArray(String input) {
        char[] chars = input.toCharArray();
        String invertedWord = "";
        int size = chars.length;
        while (size > 0) {
            invertedWord = invertedWord + chars[size - 1];
            size = size - 1;
        }
        return invertedWord;
    }

    public static void main(String[] args) {
        System.out.println(revertOnArray("Hello"));
    }
}
