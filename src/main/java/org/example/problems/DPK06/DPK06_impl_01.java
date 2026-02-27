package org.example.problems.DPK06;

import java.util.Arrays;

public class DPK06_impl_01 {
    public static String[] tokenizer(String input, String delimiter) {
        if (input == null || delimiter == null) {
            return new String[0];
        }
        return input.split(java.util.regex.Pattern.quote(delimiter));
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
