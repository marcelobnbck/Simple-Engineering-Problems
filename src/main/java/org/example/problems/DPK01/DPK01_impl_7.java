package org.example.problems.DPK01;

public class DPK01_impl_7 {
    public static String reverseUsingStream(String input) {
        return input
                .chars()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseUsingStream("Hello"));
    }
}
