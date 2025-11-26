package org.example.problems.DPK01;

public class DPK01_impl_04 {
    public static String revertStringbuilderAppend(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(revertStringbuilderAppend("Hello"));
    }
}
