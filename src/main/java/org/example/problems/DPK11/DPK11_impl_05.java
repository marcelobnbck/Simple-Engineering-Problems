package org.example.problems.DPK11;

import java.util.ArrayList;
import java.util.List;

public class DPK11_impl_05 {
    public static List<String> replace(String text, String token, String replacement) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        String delimiter = token;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (delimiter.contains(String.valueOf(c))) {
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
        System.out.println(replace("Hello,World,How,Are,You", ",", "-"));
        System.out.println(replace("Hello,World,How,Are,You", ",World,", "-"));
    }
}
