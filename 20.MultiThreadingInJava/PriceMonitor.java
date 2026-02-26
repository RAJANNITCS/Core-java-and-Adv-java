// WAP to demostrating volatile keywords

public class PriceMonitor implements Runnable {
    // 1. We mark this as volatile. 
    // This ensures that when 'keepRunning' becomes false, the thread sees it instantly.
    private volatile boolean keepRunning = true;

    // This method will be called by a different thread (e.g., the Main thread)
    public void shutdown() {
        System.out.println("Shutdown signal received...");
        this.keepRunning = false; // Write to main memory
    }

    @Override
    public void run() {
        System.out.println("Monitor Thread started...");
        while (keepRunning) { // Read from main memory
            // Imagine fetching prices from a database or API here
            // System.out.println("Fetching latest stock prices...");
        }
        System.out.println("Monitor Thread stopped safely.");
    }

    public static void main(String[] args) throws InterruptedException {
        PriceMonitor monitor = new PriceMonitor();
        Thread thread = new Thread(monitor);
        thread.start(); // Start the monitoring thread

        Thread.sleep(2000); // Let it run for 2 seconds

        monitor.shutdown(); // Tell the thread to stop
    }
}
