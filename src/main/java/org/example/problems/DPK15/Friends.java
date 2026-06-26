package org.example.problems.DPK15;

import java.util.ArrayList;

// 1st refactor: Moved the list of friends to a separate class
public class Friends {
    private ArrayList<String> friends;

    public Friends() {
        friends = new ArrayList<>();
    }

    public void addFriend(String friend) {
        // 2nd refactor: Validation to don't allow the
        // same friend to be added twice
        if (friends.contains(friend)) {
            System.out.println("This friend already exists");
        } else {
            friends.add(friend);
        }
    }

    // 3rd refactor: To remove a friend from the list.
    public void removeFriend(String friend) {
        friends.remove(friend);
    }

    public ArrayList<String> getFriends() {
        return friends;
    }
}