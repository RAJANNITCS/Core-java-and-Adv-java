public class UncheckedExample {

    public static void main(String[] args) {

        String name = null; // name is null

        // This will throw NullPointerException at runtime
        System.out.println(name.length());
    }
}
