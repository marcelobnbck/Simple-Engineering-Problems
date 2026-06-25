package org.example.problems.DPK15;

import java.util.ArrayList;

public class DPK15_impl_01 {
    public static class Person {
        private String name;
        private int age;
        public ArrayList<String> friends;

        public Person(String person, int age) {
            this.name = person;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            this.age = newAge;
        }

        public ArrayList<String> getFriends() {
            return friends;
        }

        public void setFriends(ArrayList<String> newFriends) {
            this.friends = newFriends;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 30);

        p1.friends.add("Paul");
        p1.friends.add("George");
        p1.friends.add("Ringo");

        System.out.println("Friends: " + p1.getFriends());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Name: " + p1.getName());
    }
}
