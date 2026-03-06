package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.List;

public class DPK06_impl_03 {
    public static List<String> tokenizer(String text, String token) {
        List<String> result = new ArrayList<>();
        tokenize(text, token.charAt(0), result);
        return result;
    }

    private static void tokenize(String text, char delimiter, List<String> result) {
        int index = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == delimiter) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            result.add(text);
            return;
        }
        result.add(text.substring(0, index));
        tokenize(text.substring(index + 1), delimiter, result);
    }

    public static void main(String[] args) {
        System.out.println(tokenizer("Hello,World,How,Are,You", ","));
        System.out.println(tokenizer("Hello World How Are You", " "));
        System.out.println(tokenizer("Hello-World-How-Are-You", "-"));
    }
}
