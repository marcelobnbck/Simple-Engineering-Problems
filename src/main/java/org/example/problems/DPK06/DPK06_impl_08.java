package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.List;

public class DPK06_impl_08 {
    public static List<String> tokenizer(String text, String token) {
        List<String> result = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == token.charAt(0)) {
                result.add(text.substring(start, i));
                start = i + 1;
            }
        }
        result.add(text.substring(start));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tokenizer("Hello,World,How,Are,You", ","));
        System.out.println(tokenizer("Hello World How Are You", " "));
        System.out.println(tokenizer("Hello-World-How-Are-You", "-"));
    }
}
