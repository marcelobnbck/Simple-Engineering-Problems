package org.example.problems.DPK01;

public class DPK01_impl_5 {
    public static void main(String[] args) {
        String okWord = "Hello";
        String nokWord = "";
        for (int i = okWord.length() - 1; i >= 0; i--) {
            nokWord += okWord.charAt(i);
        }
        System.out.println(nokWord);
    }
}
