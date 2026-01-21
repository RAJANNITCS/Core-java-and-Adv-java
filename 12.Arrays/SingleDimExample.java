// WAP to demostrating single dimensional array

public class SingleDimExample {
    public static void main(String[] args) {
        // 1. Declaration and shorthand initialization
        int[] scores  = {85, 92, 87, 88, 95};

        // 2. Printing the length
        System.out.println("Total students : " + scores.length);

        // 3. Calculating the average using a loop
        int total = 0;

        // The loop starts at index 0 and ends before index 5
        for (int i = 0; i < scores.length; i++) {
            // Accessing each score one by one
            total = total + scores[i];
        }

        double average = (double) total / scores.length;
        System.out.println("Average Score: " + average);
        
        // 4. Using the enhanced for-loop (Available since Java 5)
        // This is cleaner when you don't need the index 'i'
        for (int s : scores) {
            System.out.println("Score: " + s);
        }

        // Java 10: Local Variable Type Inference
        var grades = scores;
        for (int value : grades) {
            System.out.println(value);
        }
    }
}