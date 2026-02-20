// WAP to demostrating finally block

public class FinallyBlockDemo {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,};

        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(number[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes. ");
        }

        System.out.println("Program continues ......");
    }
}
