package org.example.problems.DPK01;

public class DPK01_impl_4 {
    public static String revert(String s) {
        if (s == null) return null;
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            stack[++top] = s.charAt(i);
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
