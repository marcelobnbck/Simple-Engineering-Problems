package org.example.problems.DPK01;

public class DPK01_impl_02 {
    public static void main(String[] args) {
        String originalWord = "Hello";
        String invertedWord = "";
        int size = originalWord.length();
        while (size > 0) {
            invertedWord = invertedWord + originalWord.charAt(size - 1);
            size = size - 1;
        }
        System.out.println(invertedWord);
    }
}
