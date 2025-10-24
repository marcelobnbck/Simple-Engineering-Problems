package org.example.problems.DPK01;

public class DPK01_impl_9 {
    public static String revert(String word) {
        if (word == null) return null;
        int n = word.length();
        char[] stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            stack[++top] = word.charAt(i);
        }
        String result = "";
        while (top >= 0) {
            result += stack[top--];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}
