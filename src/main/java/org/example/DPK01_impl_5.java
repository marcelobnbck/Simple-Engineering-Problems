package org.example;

import java.util.stream.Collectors;

public class DPK01_impl_5 {
    public static String revert(String input) {
        // Using Java Streams to reverse the string
        return new StringBuilder(
                input.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        ).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(revert("Hello"));
    }
}
