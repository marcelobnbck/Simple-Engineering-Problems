package org.example.problems.DPK01;

public class DPK01_impl_1 {
    public static void main(String[] args) {
        String originalWord = "Hello";
        String invertedWord = "";
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            invertedWord = invertedWord + originalWord.charAt(i);
        }
        System.out.println(invertedWord);
    }
}
