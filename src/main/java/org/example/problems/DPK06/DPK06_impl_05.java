package org.example.problems.DPK06;

import java.util.Arrays;

public class DPK06_impl_05 {
    public static String[] tokenizer(String text, String token) {
        char delimiter = token.charAt(0);
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == delimiter) {
                count++;
            }
        }
        String[] result = new String[count];
        int start = 0;
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == delimiter) {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        result[index] = text.substring(start);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tokenizer("Hello,World,How,Are,You", ",")));
        System.out.println(Arrays.toString(tokenizer("Hello World How Are You", " ")));
        System.out.println(Arrays.toString(tokenizer("Hello-World-How-Are-You", "-")));
    }
}
