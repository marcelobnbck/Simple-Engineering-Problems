package org.example.problems.DPK01;

public class DPK01_impl_09 {
    public static String revertWithWhile (String input) {
        String invertedWord = "";
        int size = input.length();
        while (size > 0) {
            invertedWord += input.charAt(size - 1);
            size --;
        }
        return invertedWord;
    }

    public static void main(String[] args) {
        System.out.println(revertWithWhile("Hello"));
    }
}
