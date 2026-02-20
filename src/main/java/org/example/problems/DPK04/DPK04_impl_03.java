package org.example.problems.DPK04;

public class DPK04_impl_03 {

    private static final String[] COUNTRIES = {
            "Brazil",
            "France",
            "Germany",
            "Italy",
            "Spain",
            "Usa"
    };

    private static final String[] LANGUAGES = {
            "Portuguese",
            "French",
            "German",
            "Italian",
            "Spanish",
            "English"
    };

    public static String pattern_matcher(String country) {
        int low = 0;
        int high = COUNTRIES.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int diff = Integer.signum(country.compareTo(COUNTRIES[mid]));

            index = switch (diff) {
                case 0 -> mid;
                case -1 -> { high = mid - 1; yield index; }
                case 1 -> { low = mid + 1; yield index; }
                default -> index;
            };
            if (index == mid) break;
        }
        return (index >= 0) ? LANGUAGES[index] : "Unknown";
    }

    public static void main(String[] args) {
        System.out.println(pattern_matcher("Usa"));
        System.out.println(pattern_matcher("Brazil"));
        System.out.println(pattern_matcher("Japan"));
    }
}
