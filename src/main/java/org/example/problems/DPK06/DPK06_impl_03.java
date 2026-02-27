package org.example.problems.DPK06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK06_impl_03 {

    public static String[] tokenizer(String input, String delimiter) {
        if (input == null || delimiter == null) {
            return new String[0];
        }

        List<String> result = new ArrayList<>();
        int start = 0;
        int end;

        while ((end = input.indexOf(delimiter, start)) != -1) {
            result.add(input.substring(start, end));
            start = end + delimiter.length();
        }
        result.add(input.substring(start));
        return result.toArray(new String[0]);
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
