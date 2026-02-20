package org.example.problems.DPK04;

import java.util.Objects;

public class DPK04_impl_05 {

    public static String pattern_matcher(String country) {
        String[] languages = new String[17];

        languages[2] = "Portuguese";
        languages[3] = "German";
        languages[4] = "Spanish";
        languages[5] = "Italian";
        languages[10] = "English";
        languages[16] = "French";

        try {
            String lowercase = country.toLowerCase();
            int hash = (lowercase.charAt(0) + lowercase.charAt(lowercase.length() - 1)) % 17;
            String result = languages[hash];
            return Objects.requireNonNullElse(result, "Unknown");
        } catch (Exception e) {
            return "Invalid Input";
        }
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
        System.out.println(pattern_matcher("Japan"));
    }
}
