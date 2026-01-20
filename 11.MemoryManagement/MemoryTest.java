public class MemoryTest {
    public static void main(String[] args) {
        // Create a list to hold objects
        // In a real banking app, this might be a list of Transactions
        java.util.List<byte[]> list = new java.util.ArrayList<>();

        System.out.println("Starting the application...");

        // Loop to create many objects to trigger Garbage Collection
        for (int i = 0; i < 1000; i++) {
            // Allocate 1MB of data in each loop
            byte[] data = new byte[1024 * 1024]; 
            list.add(data); // Add to list so it is NOT eligible for GC yet
            
            // Print memory status
            System.out.println("Created object " + i);
            
            // If we clear the list, objects become eligible for GC
            if (i % 100 == 0) {
                list.clear(); // Now Serial GC can clean these up during a pause
            }
        }
    }
}