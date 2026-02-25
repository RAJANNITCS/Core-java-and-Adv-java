public class CpuWorkload {
    public static void main(String[] args) {
        // We get the number of available CPU cores
        int cores = Runtime.getRuntime().availableProcessors(); 
        System.out.println("My CPU has " + cores + " cores.");

        long startTime = System.currentTimeMillis(); // Record start time

        // CPU Intensive Task: Calculating a huge sum
        long sum = 0;
        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i; // This line forces the ALU to do math 1 billion times
        }

        long endTime = System.currentTimeMillis(); // Record end time
        
        // Explain: The CPU processed 1 billion additions in these milliseconds
        System.out.println("Result: " + sum);
        System.out.println("Time taken by CPU: " + (endTime - startTime) + "ms");
    }
}