
import java.util.HashSet;
import java.util.Objects;

class UserProfile {

    private Long userId;     // unique identifier
    private String name;
    private String email;

    public UserProfile(Long userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    // equals() based ONLY on userId
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;        // Reflexive check

        if (obj == null) return false;       // Null check

        if (getClass() != obj.getClass()) return false;  // Class check

        UserProfile other = (UserProfile) obj;

        return Objects.equals(this.userId, other.userId);
    }

    // hashCode must also use userId
    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return this.userId + "-" + this.name + "-" + this.email;
    }
}

public class UserProfileDemo {
    public static void main(String[] args) {
        HashSet<UserProfile> users = new HashSet<>();
        users.add(new UserProfile(0001L, "rajan singh", "rajan.nit.cs@gmail.com"));
        users.add(new UserProfile(0001L, "rajan singh", "rajan.nit.cs@gmail.com"));
        System.out.println(users);
    } 
}
