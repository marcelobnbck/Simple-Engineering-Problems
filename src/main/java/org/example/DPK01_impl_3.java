package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DPK01_impl_3 {
    public static void main(String[] args) {
        // This implementation splits the string into an array,
        // and reverses it using Collections.reverse().
        String originalWord = "Hello";
        List<String> letters = Arrays.asList(originalWord.split(""));
        Collections.reverse(letters);
        String invertedWord = String.join("", letters);
        System.out.println(invertedWord);
    }
}