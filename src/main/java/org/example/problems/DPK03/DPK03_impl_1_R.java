package org.example.problems.DPK03;

import java.util.HashMap;
import java.util.Map;

public class DPK03_impl_1_R {
    private static class User {
        int id;
        String name;
        String email;

        public User(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
    }

    private final Map<String, String> nameToEmailMap;
    private final Map<String, String> emailToNameMap;

    public DPK03_impl_1_R() {
        nameToEmailMap = new HashMap<>();
        emailToNameMap = new HashMap<>();

        User john = new User(1, "John", "john@john.jhon.com");
        User alice = new User(2, "Alice", "alice@aliceweb.com");

        populateMaps(john);
        populateMaps(alice);
    }

    private void populateMaps(User user) {
        nameToEmailMap.put(user.name, user.email);
        emailToNameMap.put(user.email, user.name);
    }

    public String lookup(String key) {
        if (nameToEmailMap.containsKey(key)) {
            return nameToEmailMap.get(key);
        }
        if (emailToNameMap.containsKey(key)) {
            return emailToNameMap.get(key);
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        DPK03_impl_1_R lookupService = new DPK03_impl_1_R();
        System.out.println("Lookup 'John': " + lookupService.lookup("John"));
        System.out.println("Lookup 'john@john.jhon.com': " + lookupService.lookup("john@john.jhon.com"));
        System.out.println("Lookup 'Unknown': " + lookupService.lookup("Unknown"));
    }
}
