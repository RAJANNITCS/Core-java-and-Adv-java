public class FinallyKeywords {

    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {
            // Creating an integer array of size 5
            int[] arr = new int[5];

            // Performing division and assigning the result to index 4
            // 33 / 2 = 16 (integer division)
            arr[4] = 33 / 2;
        }

        // catch block handles any exception that occurs in the try block
        catch (Exception e) {
            // Prints the exception details (if any exception occurs)
            e.printStackTrace();
        }

        // finally block always executes whether an exception occurs or not
        finally {
            // This message will always be printed
            System.out.println("it run");
        }
    }
}
