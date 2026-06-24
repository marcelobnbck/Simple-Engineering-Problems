package org.example.problems.DPK15;

import java.util.ArrayList;

public class DPK15_impl_01 {
    public static class Person {
        private String name;
        private int age;
        private ArrayList<String> friends;

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
        Person p1 = new Person();

        p1.setName("John");
        p1.setAge(30);
        p1.setFriends(new ArrayList<>() {{
            add("Paul");
            add("George");
            add("Ringo");
        }});

        System.out.println("Friends: " + p1.getFriends());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Name: " + p1.getName());
    }
}
