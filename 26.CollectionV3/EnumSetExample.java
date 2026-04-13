// WAP to demostrating EnumSet class and importent methods

// Define enum

import java.util.EnumSet;

enum Role {
    ADMIN, USER, GUEST
}

public class EnumSetExample {
    public static void main(String[] args) {

        // Create EnumSet with specific values
        EnumSet<Role> roles = EnumSet.of(Role.ADMIN, Role.USER);

        // Add element
        roles.add(Role.GUEST);

        // Print roles
        System.out.println(roles);

        // Remove element
        roles.remove(Role.USER);

        // Check element
        if (roles.contains(Role.ADMIN)) {
            System.out.println("Admin exists");
        }

        // Iterate
        for (Role role : roles) {
            System.out.println(role);
        }
    }
}
