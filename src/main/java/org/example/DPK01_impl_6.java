package org.example;

public class DPK01_impl_6 {
    public static String revert(String input) {
        // Recursive method to reverse the string
        if (input == null || input.length() <= 1)
            return input;
        return revert(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}
