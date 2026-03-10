package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.List;

public class DPK06_impl_07 {
    public static List<String> tokenizer(String text, String token) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        char delimiter = token.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == delimiter) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(c);
            }
        }
        result.add(current.toString());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tokenizer("Hello,World,How,Are,You", ","));
        System.out.println(tokenizer("Hello World How Are You", " "));
        System.out.println(tokenizer("Hello-World-How-Are-You", "-"));
    }
}
