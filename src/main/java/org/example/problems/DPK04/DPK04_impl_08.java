package org.example.problems.DPK04;

import java.util.Arrays;

public class DPK04_impl_08 {

    public static final String[] COUNTRY = {
            "Brazil",
            "France",
            "Germany",
            "Italy",
            "Spain",
            "Usa"
    };

    public static final String[] LANGS = {
            "Portuguese",
            "French",
            "German",
            "Italian",
            "Spanish",
            "English"
    };

    public static String pattern_matcher(String country) {
        int index = Arrays.binarySearch(COUNTRY, country);
        return (index >= 0) ? LANGS[index] : "Language unknown";
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
