// WAP to demostrating Or method in opetional class

import java.util.Optional;

public class OrExample {
    public static void main(String[] args) {
        Optional<String> dbUser = Optional.empty();

        Optional<String> backupUser = dbUser.or(() -> Optional.of("DefaultUser"));

        System.out.println(backupUser.get());
        
    }
}
