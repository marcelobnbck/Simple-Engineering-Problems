package org.example.problems.DPK15;

import java.util.ArrayList;

public class DPK15_impl_01 {
    class Person {
        String name;
        int age;
        ArrayList<String> friend = new ArrayList<>();
        Person(String name, int age, ArrayList<String> friend) {
            this.name = name;
            this.age = age;
            this.friend = friend;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Alice");
        friends.add("Bob");
        Person person = new DPK15_impl_01().new Person("John", 30, friends);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Friends: " + person.friend);
    }
}
