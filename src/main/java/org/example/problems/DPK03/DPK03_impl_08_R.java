package org.example.problems.DPK03;

public class DPK03_impl_08_R {
    private String[] keys = new String[4];
    private String[] values = new String[4];
    private int count = 0;

    public DPK03_impl_08_R() {
        addUserToArrays("John", "john@john.jhon.com");
        addUserToArrays("john@john.jhon.com", "John");
        addUserToArrays("Alice", "alice@aliceweb.com");
        addUserToArrays("alice@aliceweb.com", "Alice");
    }

    private void addUserToArrays(String key, String value) {
        keys[count] = key;
        values[count] = value;
        count++;
    }

    public String lookup(String searchKey) {
        for (int i = 0; i < count; i++) {
            if (keys[i] != null && keys[i].equals(searchKey)) {
                return values[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        DPK03_impl_08_R service = new DPK03_impl_08_R();
        System.out.println("Lookup 'John': " + service.lookup("John"));
        System.out.println("Lookup 'john@john.jhon.com': " + service.lookup("john@john.jhon.com"));
        System.out.println("Lookup 'Unknown': " + service.lookup("Unknown"));
    }
}
