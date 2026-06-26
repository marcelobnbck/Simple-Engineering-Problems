package org.example.problems.DPK15;

import java.util.ArrayList;

public class Friends {
    private ArrayList<String> friends;

    public Friends() {
        friends = new ArrayList<>();
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public ArrayList<String> getFriends() {
        return friends;
    }
}