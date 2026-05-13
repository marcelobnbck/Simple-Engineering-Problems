package org.example.problems.DPK11;

public class DPK11_impl_05 {
    public static String replaceFor(String text, String target, String replacement) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            boolean match = true;

            if (i + target.length() <= text.length()) {
                for (int j = 0; j < target.length(); j++) {
                    if (text.charAt(i + j) != target.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            if (match) {
                result += replacement;
                i += target.length() - 1;
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceFor("Hello,World,How,Are,You", ",", "-"));
        System.out.println(replaceFor("Hello,World,How,Are,You", ",World,", "-"));
    }
}
