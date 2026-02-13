package org.example.problems.DPK04;

public class DPK04_impl_06 {

    public static String pattern_matcher(String input) {

        if (input == null) {
            return "Invalid input";
        }

        switch (input.toLowerCase()) {
            case "usa" -> {
                return "English";
            }
            case "brazil" -> {
                return "Portuguese";
            }
            case "spain" -> {
                return "Spanish";
            }
            case "italy" -> {
                return "Italian";
            }
            case "france" -> {
                return "French";
            }
            case "germany" -> {
                return "German";
            }

        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
