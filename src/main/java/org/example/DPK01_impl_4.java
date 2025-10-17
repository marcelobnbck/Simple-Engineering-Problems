package org.example;

public class DPK01_impl_4 {
    public static String revert(String input) {
        // Using a char array to reverse the string manually
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}