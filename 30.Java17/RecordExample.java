// WAP to demostrating Record Example

record User(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {

        User user = new User("rajan", 35);

        System.out.println(user.name());
    }
}
