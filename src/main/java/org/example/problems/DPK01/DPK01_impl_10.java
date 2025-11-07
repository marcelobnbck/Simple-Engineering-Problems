package org.example.problems.DPK01;

public class DPK01_impl_10 {
    public static String revertOnArrayInc(String input) {
        char[] chars = input.toCharArray();
        String invertedWord = "";
        int size = chars.length;
        while (size > 0) {
            invertedWord += chars[size - 1];
            size --;
        }
        return invertedWord;
    }

    public static void main(String[] args) {
        System.out.println(revertOnArrayInc("Hello"));
    }
}
