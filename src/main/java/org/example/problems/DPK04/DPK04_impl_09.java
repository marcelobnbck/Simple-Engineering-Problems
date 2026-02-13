package org.example.problems.DPK04;

public class DPK04_impl_09 {
    public static String pattern_matcher(String input) {
        String[] langs = new String[16];

        langs[2] = "Portuguese";
        langs[3] = "Spanish";
        langs[5] = "English";
        langs[6] = "French";
        langs[7] = "German";
        langs[9] = "Italian";

        try {
            int maskedIndex = input.charAt(0) & 0x0F;
            String result = langs[maskedIndex];

            return java.util.Objects.requireNonNullElse(result, "Unknown");
        } catch (Exception e) {
            return "Invalid Input";
        }
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
    }
}
