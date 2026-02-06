package org.example.problems.DPK04;

import java.util.Arrays;

public class DPK04_impl_03 {

    private static final String[] COUNTRIES = {
            "Brazil", "France", "Germany", "Italy", "Spain", "Usa"
    };

    private static final String[] LANGUAGES = {
            "Portuguese", "French", "German", "Italian", "Spanish", "English"
    };

    public static String pattern_matcher(String country) {
        int index = Arrays.binarySearch(COUNTRIES, country);
        return (index >= 0) ? LANGUAGES[index] : "Language unknown";
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
