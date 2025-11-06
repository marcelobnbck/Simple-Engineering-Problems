package org.example.problems.DPK01;

public class DPK01_impl_4 {
    public static String revertStringbuilderAppend(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(revertStringbuilderAppend("Hello"));
    }
}
