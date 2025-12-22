// Write a program to explain System.err

public class SystemErrExample {
    public static void main(String[] args) {
        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        //Using printf()
        System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");
    }
}