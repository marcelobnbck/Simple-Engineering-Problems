package org.example.problems.DPK11;

public class DPK11_impl_04 {
    public static String replaceSimplified(String text, String token, String replacement) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < text.length()) {
            boolean match = true;

            if (i + token.length() <= text.length()) {
                for (int j = 0; j < token.length(); j++) {
                    if (text.charAt(i + j) != token.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            if (match) {
                result.append(replacement);
                i += token.length();
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSimplified("Hello,World,How,Are,You", ",", "-"));
        System.out.println(replaceSimplified("Hello,World,How,Are,You", ",World,", "-"));
    }
}
