package org.example.problems.DPK04;

public class DPK04_impl_01 {

    public static String pattern_matcher(String country) {
        if (country == null) {
            return "Invalid input";
        }

        if (country.equalsIgnoreCase("Usa")) {
            return "English";
        } else if (country.equalsIgnoreCase("Brazil")) {
            return "Portuguese";
        } else if (country.equalsIgnoreCase("Spain")) {
            return "Spanish";
        } else if (country.equalsIgnoreCase("Italy")) {
            return "Italian";
        } else if (country.equalsIgnoreCase("France")) {
            return "French";
        } else if (country.equalsIgnoreCase("Germany")) {
            return "German";
        } else {
            return "Language unknown";
        }
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
