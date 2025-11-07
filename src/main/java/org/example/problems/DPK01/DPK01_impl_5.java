package org.example.problems.DPK01;

import java.util.Stack;

public class DPK01_impl_5 {
    public static String revertWithStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder revertedString = new StringBuilder();
        while (!stack.isEmpty()) {
            revertedString.append(stack.pop());
        }
        return revertedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(revertWithStack("Hello"));
    }
}
