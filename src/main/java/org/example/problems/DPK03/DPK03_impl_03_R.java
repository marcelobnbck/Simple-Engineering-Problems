package org.example.problems.DPK03;

import java.util.HashMap;
import java.util.Map;

public class DPK03_impl_03_R {
    private final Map<String, String> unifiedLookupMap;

    public DPK03_impl_03_R() {
        unifiedLookupMap = new HashMap<>();

        addUserToMap(1, "John", "john@john.jhon.com");
        addUserToMap(2, "Alice", "alice@aliceweb.com");
    }

    private void addUserToMap(int id, String name, String email) {
        unifiedLookupMap.put(name, email);
        unifiedLookupMap.put(email, name);
    }

    public String lookup(String key) {
        return unifiedLookupMap.getOrDefault(key, "Not Found");
    }

    public static void main(String[] args) {
        DPK03_impl_03_R lookupService = new DPK03_impl_03_R();

        System.out.println("Lookup 'John': " + lookupService.lookup("John"));
        System.out.println("Lookup 'john@john.jhon.com': " + lookupService.lookup("john@john.jhon.com"));
        System.out.println("Lookup 'Unknown': " + lookupService.lookup("Unknown"));
    }
}
