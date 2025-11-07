package org.example.problems.DPK01;

public class DPK01_impl_6 {
    public static String reverseRecursive(String str) {
        if (str.isEmpty()) {
            System.out.println("Empty");
            return str;
        } else {
            return reverseRecursive(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseRecursive("Hello"));
    }
}
