package org.example.problems.DPK11;

public class DPK11_impl_10 {
    public static String replaceStringWhile(String text, String target, String replacement) {
        String result = "";
        int i = 0;

        while (i < text.length()) {
            boolean match = true;

            if (i + target.length() <= text.length()) {
                int j = 0;
                while (j < target.length()) {
                    if (text.charAt(i + j) != target.charAt(j)) {
                        match = false;
                        break;
                    }
                    j++;
                }
            } else {
                match = false;
            }

            if (match) {
                result += replacement;
                i += target.length();
            } else {
                result += text.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceStringWhile("Hello,World,How,Are,You", ",", "-"));
        System.out.println(replaceStringWhile("Hello,World,How,Are,You", ",World,", "-"));
    }
}

