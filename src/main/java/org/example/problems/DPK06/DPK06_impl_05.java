package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.List;

public class DPK06_impl_05 {
    public static List<String> tokenizer(String text, String token) {
        List<String> tokens = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();
        char delimiter = token.charAt(0);

        for (char c : text.toCharArray()) {
            switch (c) {
                case ',':
                case ' ':
                case '-':
                    if (c == delimiter) {
                        tokens.add(buffer.toString());
                        buffer.setLength(0);
                        break;
                    }
                default:
                    buffer.append(c);
            }
        }
        tokens.add(buffer.toString());
        return tokens;
    }

    public static void main(String[] args) {
        System.out.println(tokenizer("Hello,World,How,Are,You", ","));
        System.out.println(tokenizer("Hello World How Are You", " "));
        System.out.println(tokenizer("Hello-World-How-Are-You", "-"));
    }
}
