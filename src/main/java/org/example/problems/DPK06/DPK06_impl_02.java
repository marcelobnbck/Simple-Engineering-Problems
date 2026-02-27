package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK06_impl_02 {
    public static String[] tokenizer(String input, String delimiter) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        List<String> tokens = new ArrayList<>();
        StringBuilder currentToken = new StringBuilder();

        char delimiterChar = delimiter.charAt(0);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == delimiterChar) {
                if (!currentToken.isEmpty()) {
                    tokens.add(currentToken.toString());
                    currentToken.setLength(0);
                }
            } else {
                currentToken.append(c);
            }
        }

        if (!currentToken.isEmpty()) {
            tokens.add(currentToken.toString());
        }
        return tokens.toArray(new String[0]);
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
