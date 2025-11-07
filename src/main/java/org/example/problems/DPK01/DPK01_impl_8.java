package org.example.problems.DPK01;

public class DPK01_impl_8 {
    public static String revertWithFor (String input) {
        String invertedWord = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertedWord += input.charAt(i);
        }
        return invertedWord;
    }

    public static void main(String[] args) {
        System.out.println(revertWithFor("Hello"));
    }
}
