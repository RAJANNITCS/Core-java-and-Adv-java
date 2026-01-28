import java.util.ArrayList;
import java.util.List;

public class G1Demo {
    // This list will hold objects to move them to the "Old Generation"
    static List<byte[]> longLivedObjects = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Starting G1 Simulation...");

        for (int i = 0; i < 1000; i++) {
            // 1. Create short-lived garbage (Eden Space usage)
            createGarbage();

            // 2. Periodically move objects to long-lived list (Old Gen usage)
            if (i % 10 == 0) {
                // Allocate 1MB and keep the reference
                longLivedObjects.add(new byte[1024 * 1024]);
            }

            try {
                Thread.sleep(50); // Slow down to observe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createGarbage() {
        // This array is created and immediately becomes eligible for GC
        byte[] garbage = new byte[1024 * 512]; // 512KB
    }
}