package org.example.problems.DPK04;

import java.util.Objects;

public class DPK04_impl_10 {
    public static String pattern_matcher(String input) {
        String[] langs = new String[17];
        langs[2] = "Portuguese";
        langs[3] = "German";
        langs[4] = "Spanish";
        langs[5] = "Italian";
        langs[10] = "English";
        langs[16] = "French";

        try {
            String lowercase = input.toLowerCase();
            int hash = (lowercase.charAt(0) + lowercase.charAt(lowercase.length() - 1)) % 17;
            String result = langs[hash];
            return Objects.requireNonNullElse(result, "Unknown");
        } catch (Exception e) {
            return "Invalid Input";
        }
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
