package org.example.problems.DPK01;

public class DPK01_impl_3 {
    public static String revert(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        return revert(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}
