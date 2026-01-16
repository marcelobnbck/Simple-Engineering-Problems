##  PROBLEM SET DPK01: String Reversal (11 implementations)

Problem Goal: Reverse a String from "Hello" to "olleH"

Core Java Concepts Used:

###  1. Package Declaration

package org.example.problems.DPK01;
- What: Defines the namespace/folder structure for organizing classes
- Why: Prevents naming conflicts, organizes code logically, matches directory structure
- Context: Java's way of grouping related classes, similar to folders in a file system

###  2. Class Declaration

public class DPK01_impl_01 { }
- public: Access modifier - class is visible to all other classes
- class: Keyword to define a blueprint for objects
- Why public: Allows the JVM and other classes to access and execute this class

###  3. Main Method

public static void main(String[] args) { }
- public: Must be accessible to JVM to start the program
- static: Belongs to the class itself, not an instance. JVM calls it without creating an object
- void: Returns nothing to the caller
- main: Required method name that JVM looks for as the entry point
- String[] args: Array of command-line arguments passed when running the program
- Why: This is the contract with the JVM - every Java application needs this signature to run

  ---
###  Implementation Approaches:

**DPK01_impl_01 & DPK01_impl_08: For Loop Approach**

for (int i = originalWord.length() - 1; i >= 0; i--) {
invertedWord = invertedWord + originalWord.charAt(i);
}

**Terms Explained:**
- String: Immutable sequence of characters (cannot be changed after creation)
- .length(): Method that returns the number of characters in the string
- for: Loop that executes a fixed number of times
- int i: Loop counter variable (integer type)
- i--: Decrement operator, reduces i by 1 after each iteration
- i >= 0: Condition - loop continues while i is greater than or equal to 0
- .charAt(i): Returns the character at position i (0-based indexing)
- + operator with Strings: Concatenation - combines strings together
- +=: Compound assignment operator, shorthand for invertedWord = invertedWord + ...

**Why This Approach:**
- Simple and intuitive for beginners
- Shows fundamental loop control
- Demonstrates string immutability (creates new String object on each concatenation)

**Performance Note:** Not efficient for large strings because strings are immutable - each concatenation creates a new String object in memory

  ---
**DPK01_impl_02 & DPK01_impl_09: While Loop Approach**

int size = originalWord.length();
while (size > 0) {
invertedWord = invertedWord + originalWord.charAt(size - 1);
size = size - 1;
}

**Terms Explained:**
- while: Loop that continues as long as the condition is true
- size > 0: Condition checked before each iteration
- size - 1: Accesses the last character (since indexing starts at 0)

**Why This Approach:**
- Alternative loop structure to for loop
- Useful when number of iterations isn't known in advance (though here it is)
- Teaches different loop patterns

**Difference from For Loop:**
- More manual control - you manage the counter variable explicitly
- More flexible but requires more careful management

  ---
**DPK01_impl_03 & DPK01_impl_10: Array Conversion Approach**

char[] chars = input.toCharArray();

**Terms Explained:**
- char: Primitive data type representing a single character (16-bit Unicode)
- char[]: Array of characters
- []: Array notation - declares a collection of elements of the same type
- .toCharArray(): String method that converts the string into a character array

**Why This Approach:**
- Demonstrates working with arrays (fundamental data structure)
- Shows type conversion from String to char array
- Arrays allow indexed access and manipulation
- Teaching array iteration patterns

  ---
**DPK01_impl_04: StringBuilder with Append**

StringBuilder sb = new StringBuilder();
sb.append(input.charAt(i));
return sb.toString();

**Terms Explained:**
- StringBuilder: Mutable sequence of characters (can be modified without creating new objects)
- new: Keyword to create a new object instance in memory
- (): Constructor call - initializes the object
- .append(): Adds content to the end of the StringBuilder efficiently
- .toString(): Converts StringBuilder back to a String

**Why This Approach:**
- EFFICIENT for string concatenation in loops
- Avoids creating multiple String objects (unlike string concatenation with +)
- Industry standard for building strings programmatically
- Shows understanding of mutable vs immutable types

Performance: O(n) time complexity vs O(n²) for string concatenation in loops

  ---
**DPK01_impl_05: Stack Data Structure**

import java.util.Stack;
Stack<Character> stack = new Stack<>();
stack.push(c);
revertedString.append(stack.pop());

**Terms Explained:**
- import: Brings external classes into the current file's namespace
- java.util.Stack: Built-in class implementing LIFO (Last-In-First-Out) data structure
- Stack<Character>: Generic type declaration - Stack that holds Character objects
- <>: Diamond operator for generics (type safety at compile time)
- .push(c): Adds element to the top of the stack
- .pop(): Removes and returns the element from the top
- .isEmpty(): Returns true if stack has no elements
- for (char c : input.toCharArray()): Enhanced for loop (for-each) iterates over each element

**Why This Approach:**
- Demonstrates LIFO data structure behavior
- Natural fit for reversal (what goes in last comes out first)
- Shows understanding of data structure selection
- Teaches stack operations

**Educational Value:** Excellent for teaching how data structures solve problems naturally

  ---
**DPK01_impl_06: Recursive Approach**

public static String reverseRecursive(String input) {
if (input.isEmpty()) {
return input;
} else {
return reverseRecursive(input.substring(1)) + input.charAt(0);
}
}

**Terms Explained:**
- static: Method belongs to the class, can be called without creating an instance
- Recursion: Function calling itself to solve a problem
- .isEmpty(): Returns true if string has no characters
- .substring(1): Returns a new string starting from index 1 (removes first character)
- Base case: if (input.isEmpty()) - stopping condition to prevent infinite recursion
- Recursive case: Function calls itself with smaller input

**Why This Approach:**
- Demonstrates recursive thinking (divide and conquer)
- Shows base case and recursive case pattern
- Teaches call stack concept
- Functional programming style

**How It Works:**
1. Takes first character, recursively reverses the rest
2. Appends first character to the end of reversed rest
3. Base case: empty string returns empty

**Performance Note:** Less efficient due to call stack overhead and string immutability

  ---
**DPK01_impl_07: Java Streams (Functional Programming)**

return input
.chars()
.mapToObj(c -> (char) c)
.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
.reverse()
.toString();

**Terms Explained:**
- .chars(): Converts String to IntStream of Unicode code points
- Stream: Sequence of elements supporting functional-style operations
- .mapToObj(): Transforms each element to an object
- c -> (char) c: Lambda expression (arrow function) for casting int to char
- Lambda: Anonymous function (unnamed, inline function)
- .collect(): Terminal operation that reduces stream to a single result
- StringBuilder::new: Method reference for constructor (Supplier)
- StringBuilder::append: Method reference for accumulator and combiner
- Method Reference (::): Shorthand for lambda expressions
- .reverse(): StringBuilder method to reverse the content
- Fluent API: Method chaining pattern

**Why This Approach:**
- Modern Java (8+) functional programming style
- Declarative vs imperative programming
- Shows understanding of streams and functional concepts
- Professional, concise code style

**Educational Value:** Teaches functional programming paradigms in Java

  ---
**DPK01_impl_01_S: Study File with Comments**

This file is identical to impl_01 but includes detailed educational comments explaining:
- Package declaration purpose
- Public class visibility
- Main method signature breakdown
- Entry point concept

Why Separate Study File:
- Clean code separation
- Detailed documentation for learning
- Reference material without cluttering production code

  ---
##  PROBLEM SET DPK02: Integer Array Reversal (10 implementations)

Problem Goal: Reverse an integer array from [1,2,3,4,5] to [5,4,3,2,1]

Core Concepts Introduced:

###  1. Primitive Arrays

int[] array = {1, 2, 3, 4, 5};
- int[]: Array of primitive integers
- {}: Array initializer syntax
- Why primitive arrays: Efficient memory usage, direct value storage (not objects)

###  2. ArrayList (Dynamic Array)

import java.util.ArrayList;
ArrayList<Integer> invertedList = new ArrayList<>();

**Terms Explained:**
- ArrayList: Resizable array implementation from Java Collections Framework
- <Integer>: Generic type parameter - stores Integer objects
- Integer: Wrapper class for primitive int (object representation)
- Why wrapper class: Generics don't work with primitives, need objects
- <>(): Diamond operator with constructor (type inference from left side)

**Why ArrayList:**
- Dynamic size (grows automatically)
- Rich API (methods for manipulation)
- Part of Collections Framework
- Type-safe with generics

**ArrayList vs Array:**
- Array: Fixed size, can hold primitives
- ArrayList: Dynamic size, only holds objects

  ---
###  Implementation Approaches:

**DPK02_impl_01, 02, 04, 05, 07, 08, 10: ArrayList Conversion**

ArrayList<Integer> invertedList = new ArrayList<>();
for (int i = input.length - 1; i >= 0; i--) {
invertedList.add(input[i]);
}

**Terms Explained:**
- .add(): Appends element to the end of ArrayList
- Auto-boxing: Automatic conversion from int to Integer when adding to ArrayList

**Why This Approach:**
- Creates new collection (original array unchanged)
- Flexible return type (ArrayList has more methods than arrays)
- Shows Collections Framework usage

**Variations:**
- impl_01, 04, 07, 10: Use for loop
- impl_02, 05, 08: Use while loop

  ---
###  DPK02_impl_03, 06, 09: In-Place Reversal (Two Pointers)

int left = 0;
int right = arr.length - 1;
while (left < right) {
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left++;
right--;
}

**Terms Explained:**
- Two-pointer technique: Algorithm pattern using two indices moving toward each other
- temp: Temporary variable for swapping values
- Swap algorithm: Exchange two values using temporary storage
- left++: Increment operator, moves left pointer right
- right--: Decrement operator, moves right pointer left

**Why This Approach:**
- Space efficient: O(1) extra space (modifies array in place)
- Time efficient: O(n/2) = O(n) - only traverse half the array
- Common interview algorithm pattern
- Teaches pointer manipulation

**Process:**
1. Start at both ends of array
2. Swap elements at left and right positions
3. Move pointers toward center
4. Stop when pointers meet or cross

  ---
###  DPK02 - Using Arrays.toString()

import java.util.Arrays;
System.out.println(Arrays.toString(reverseArray5(fiveArray)));

**Terms Explained:**
- Arrays: Utility class with static methods for array operations
- .toString(): Static method that converts array to readable string format
- Why needed: Arrays don't have meaningful toString() method by default (would print memory address)

  ---
##  PROBLEM SET DPK03: HashMap Lookup Service (4 implementations)

Problem Goal: Create a lookup service mapping IDs/names to data using HashMap

###  Core Concepts Introduced:

**1. HashMap (Key-Value Data Structure)**

import java.util.HashMap;
import java.util.Map;
Map<Integer, String> idToNameMap = new HashMap<>();

**Terms Explained:**
- HashMap: Hash table implementation of Map interface
- Map: Interface defining key-value pair storage
- <Integer, String>: Generic types - Key type, Value type
- Key-Value pair: Association between unique key and its value
- Hash table: Data structure using hash function for O(1) average lookup

**Why HashMap:**
- Fast lookups: O(1) average time complexity
- Flexible key-value associations
- Widely used for caching and lookups
- Part of Collections Framework

  ---
**2. Instance Variables (Fields)**

private final Map<Integer, String> idToNameMap;

**Terms Explained:**
- private: Access modifier - only accessible within this class
- final: Cannot be reassigned after initialization (reference is constant)
- Instance variable: Belongs to each object instance, stores object state
- Why private: Encapsulation - hide internal implementation details
- Why final: Immutable reference (the Map reference won't change, though contents can)

  ---
**3. Constructor**

public DPK03_impl_01() {
idToNameMap = new HashMap<>();
idToNameMap.put(1, "John");
}

**Terms Explained:**
- Constructor: Special method called when creating new object with new
- Same name as class: Constructor must match class name exactly
- No return type: Constructors don't have return types (not even void)
- Purpose: Initialize object state, set up instance variables

  ---
**4. HashMap Methods**

idToNameMap.put(1, "John");
return idToNameMap.getOrDefault(id, "Not Found");

**Terms Explained:**
- .put(key, value): Inserts or updates key-value pair
- .get(key): Retrieves value for given key (returns null if not found)
- .getOrDefault(key, defaultValue): Returns value or default if key doesn't exist
- .containsKey(key): Returns true if key exists in map

**Why getOrDefault:**
- Handles missing keys gracefully
- Avoids null checks
- More readable than get() with null checking

  ---
###  Implementation Approaches:

**DPK03_impl_01: Simple ID to Name Lookup**

private final Map<Integer, String> idToNameMap;
- Maps integer IDs to string names
- Single direction lookup (ID → Name)
- Demonstrates basic HashMap usage

  ---
**DPK03_impl_01_R: Bidirectional Lookup with Inner Class**

private static class User {
int id;
String name;
String email;
}

**Terms Explained:**
- Inner class: Class defined inside another class
- static: Inner class doesn't need instance of outer class
- Why inner class: Encapsulates User data structure, not needed outside this class
- Two Maps: One for name→email, another for email→name

**Terms in User Class:**
- this: Refers to the current object instance
- Constructor with parameters: Initializes fields with provided values

Bidirectional Lookup Logic:
if (nameToEmailMap.containsKey(key)) {
return nameToEmailMap.get(key);
}
if (emailToNameMap.containsKey(key)) {
return emailToNameMap.get(key);
}
- Checks first map, then second map
- Enables lookup by either name or email

  ---
**DPK03_impl_02_R: Chained getOrDefault**

return nameToEmailMap.getOrDefault(key,
emailToNameMap.getOrDefault(key, "Not Found"));

**Terms Explained:**
- Nested method calls: Inner call executes first, result passed to outer call
- Short-circuit evaluation: If first map has key, second map never checked

**Why This Approach:**
- More concise than if-else chains
- Functional programming style
- Same functionality, different syntax

  ---
**DPK03_impl_03_R: Unified Single Map**

private final Map<String, String> unifiedLookupMap;
unifiedLookupMap.put(name, email);
unifiedLookupMap.put(email, name);

**Why This Approach:**
- Simplifies to one data structure
- Both directions stored in same map
- More efficient memory usage (one map instead of two)
- Simpler lookup logic

Trade-off: Keys must be unique across both names and emails

  ---
#  CROSS-CUTTING JAVA CONCEPTS

##  1. Method Signatures

public static String revertWithStack(String input)
- Access modifier (public): Visibility scope
- static: Class-level vs instance-level
- Return type (String): What the method gives back
- Method name: Descriptive action verb
- Parameters: Input values in parentheses

##  2. Naming Conventions

- Classes: PascalCase (DPK01_impl_01)
- Methods: camelCase (reverseRecursive)
- Variables: camelCase (invertedWord)
- Constants: UPPER_SNAKE_CASE (not shown in these examples)

##  3. Immutability vs Mutability

- Immutable: String - cannot be changed after creation
- Mutable: StringBuilder, ArrayList, arrays - can be modified

##  4. Data Structure Selection

- String: Immutable text
- StringBuilder: Efficient mutable string building
- Array: Fixed-size, indexed collection
- ArrayList: Dynamic-size, indexed collection
- Stack: LIFO operations
- HashMap: Key-value lookups

##  5. Algorithm Patterns

- Iteration: For/while loops traversing collections
- Recursion: Self-referential problem solving
- Two-pointers: Efficient in-place array manipulation
- LIFO: Stack-based reversal

##  6. Programming Paradigms

- Imperative: Step-by-step instructions (most implementations)
- Functional: Streams, lambdas (impl_07)
- Object-Oriented: Classes, encapsulation (DPK03)

  ---
#  LEARNING PROGRESSION

The codebase follows a clear educational path:

1. DPK01: Basic string manipulation, loops, recursion
2. DPK02: Arrays, collections, algorithm patterns
3. DPK03: Object-oriented design, data structures, encapsulation

Each problem set shows multiple ways to solve the same problem, teaching that there are many valid approaches with different trade-offs in:
- Readability
- Performance
- Memory usage
- Maintainability

  ---

##  DPK01 (String Reversal) - 11 implementations teaching:
- Basic syntax (package, class, main method)
- Loop structures (for, while, enhanced for)
- String immutability and manipulation
- StringBuilder for efficient string building
- Stack data structure (LIFO)
- Recursion patterns
- Java Streams and functional programming
- Method references and lambdas

##  DPK02 (Array Reversal) - 10 implementations teaching:
- Primitive arrays vs Collections
- ArrayList and generics
- Auto-boxing/unboxing
- Two-pointer algorithm pattern
- In-place vs new collection approaches
- Space and time complexity trade-offs

##  DPK03 (HashMap Lookup) - 4 implementations teaching:
- HashMap and Map interface
- Object-oriented design
- Encapsulation (private, final)
- Constructors and instance variables
- Inner classes
- Bidirectional lookups
- Method chaining and functional style
