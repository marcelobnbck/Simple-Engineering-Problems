package org.example.problems.DPK04;

public class DPK04_impl_04 {

    public static String pattern_matcher(String country) {
        String[] languages = new String[16];

        languages[2] = "Portuguese"; // Brazil
        languages[3] = "Spanish";    // Spain
        languages[5] = "English";    // Usa
        languages[6] = "French";     // France
        languages[7] = "German";     // Germany
        languages[9] = "Italian";    // Italy

        try {
            int maskedIndex = country.charAt(0) & 0x0F;
            String result = languages[maskedIndex];

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
