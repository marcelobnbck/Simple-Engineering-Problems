package org.example.problems.DPK04;

public class DPK04_impl_01 {

    public static String pattern_matcher(String country) {
        if (country == null) {
            return "Invalid Input";
        }

        switch (country.toLowerCase()) {
            case "usa":
                return "English";
            case "brazil":
                return "Portuguese";
            case "spain":
                return "Spanish";
            case "italy":
                return "Italian";
            case "france":
                return "French";
            case "germany":
                return "German";
            default:
                return "Language not found";
        }
    }
}
