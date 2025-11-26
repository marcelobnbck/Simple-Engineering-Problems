package org.example.problems.DPK01;

public class DPK01_impl_06 {
    public static String reverseRecursive(String input) {
        if (input.isEmpty()) {
            System.out.println("Empty");
            return input;
        } else {
            return reverseRecursive(input.substring(1)) + input.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseRecursive("Hello"));
    }
}
