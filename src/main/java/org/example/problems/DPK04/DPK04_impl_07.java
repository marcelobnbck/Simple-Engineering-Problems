package org.example.problems.DPK04;

public class DPK04_impl_07 {

    public static String pattern_matcher(String input) {

        if (input == null) {
            return "Invalid input";
        }

        return switch (input.toLowerCase()) {
            case "usa" -> "English";
            case "brazil" -> "Portuguese";
            case "spain" -> "Spanish";
            case "italy" -> "Italian";
            case "france" -> "French";
            case "germany" -> "German";
            default -> input;
        };
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
