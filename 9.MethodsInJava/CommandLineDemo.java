// WAP to demostrating command line argurment

public class CommandLineDemo {
    // The entry point of the program
    public static void main(String[] args) {

        // 1. Check if the user actually provided any arguments
        // This prevents the program from crashing
        if (args.length == 0) {
            System.out.println("Error : Please provide at least one argument. ");
            return; // stop the program here
        }

        // 2. Accessing the first argument
        String firstArg = args[0];
        System.out.println("The first argument is : " + firstArg);

        // 3. Iterating through all arguments using loop
        System.out.println("Listing all arguments : ");
        for (int i = 0; i < args.length; i++) {
            // print the index and the value stored at that index
            System.out.println("Argument "+ i + " : " + args[i]);
        }

        // 4. Handling a number (Conversion) 
        if (args.length >= 2) {
            try {
                // Converting String to Integer
                int value = Integer.parseInt(args[1]);
                System.out.println("The second argument as a number is: " + value);
            } catch (NumberFormatException e) {
                // if the user typed "abc" instead of "123"
                System.out.println("Error : The scond argument must be a number.");
            }
        }
    }
}