package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.List;

public class DPK06_impl_06 {
    public static List<String> tokenizer(String text, String token) {
        List<String> result = new ArrayList<>();
        while (text != token) {
            int index = text.indexOf(token);
            if (index == -1) {
                result.add(text);
                break;
            }
            result.add(text.substring(0, index));
            text = text.substring(index + token.length());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tokenizer("Hello,World,How,Are,You", ","));
        System.out.println(tokenizer("Hello World How Are You", " "));
        System.out.println(tokenizer("Hello-World-How-Are-You", "-"));
    }
}
