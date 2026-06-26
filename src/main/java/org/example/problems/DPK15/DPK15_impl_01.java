package org.example.problems.DPK15;

public class DPK15_impl_01 {
    public static class Person {
        private String name;
        private int age;
        private Friends friends;

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

        public Friends getFriends() {
            return friends;
        }

        public void setFriends(Friends newFriends) {
            this.friends = newFriends;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("John");
        p1.setAge(30);

        Friends friends = new Friends();

        friends.addFriend("Paul");
        friends.addFriend("George");
        friends.addFriend("Ringo");
        friends.addFriend("Ringo"); // Testing to include the same friend on 2nd refactor
        friends.removeFriend("Paul"); // Testing to remove a friend on 3rd refactor

        p1.setFriends(friends);

        System.out.println("Friends: " + p1.getFriends().getFriends());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Name: " + p1.getName());
    }
}
