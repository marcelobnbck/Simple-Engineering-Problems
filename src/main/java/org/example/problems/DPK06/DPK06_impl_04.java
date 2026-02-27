package org.example.problems.DPK06;

import java.util.Arrays;

public class DPK06_impl_04 {
    public static String[] tokenizer(String input, String delimiter) {
        if (input == null || delimiter == null) {
            return new String[0];
        }

        char delimiterChar = delimiter.charAt(0);
        int tokenCounter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == delimiterChar) {
                tokenCounter++;
            }
        }

        String[] result = new String[tokenCounter];
        String currentToken = "";
        int arrayIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == delimiterChar) {
                result[arrayIndex++] = currentToken;
                currentToken = "";
            } else {
                currentToken += c;
            }
        }

        result[arrayIndex] = currentToken;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                tokenizer("Hello,World,How,Are,You", ",")
        ));
        System.out.println(Arrays.toString(
                tokenizer("Hello World How Are You", " ")
        ));
        System.out.println(Arrays.toString(
                tokenizer("Hello-World-How-Are-You", "-")
        ));
    }
}
