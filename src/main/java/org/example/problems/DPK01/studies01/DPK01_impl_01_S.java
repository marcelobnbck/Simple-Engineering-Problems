/**
 * A String reversal exercise, to learning how to manipulate data structures
 * and undertsand how loops work in Java.
 */

// Folder or namespace the file belongs to. Prevents conflicts
package org.example.problems.DPK01.studies01;

// Name of the Public class. Totally accessible and visible for any other class
public class DPK01_impl_01_S {

    // The entry point of application. When run the program Java Virtual Machine (JVM)
    // looks for this line to start
    // Public: Accessible to all
    // static: belongs to the class, not to an object
    // void: not return any value
    // main: name of the method to start
    public static void main(String[] args) {
        String originalWord = "Hello";
        String invertedWord = "";
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            invertedWord = invertedWord + originalWord.charAt(i);
        }
        System.out.println(invertedWord);
    }
}
