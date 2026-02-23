package org.example.problems.DPK04;

public class DPK04_impl_04_II {

    public static String pattern_matcher(String country) {
        String[] languages = new String[16];

        languages[2] = "Portuguese";
        languages[3] = "Spanish";
        languages[5] = "English";
        languages[6] = "French";
        languages[7] = "German";
        languages[9] = "Italian";

        try {
            /**
             * Can use number 15 instead of 0x0F, as both represent the same value
             * (15 in decimal and 0x0F in hexadecimal). But using 0x0F it's clearer
             * to indicate that we are performing a bitwise operation.
             */
            //int maskedIndex = country.charAt(0) & 0x0F;
            int maskedIndex = country.charAt(0) & 15;
            String result = languages[maskedIndex];
            return java.util.Objects.requireNonNullElse(result, "Unknown");
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
