// WAP to demostrating Daemon thred 

// Creating a class that extends Thread
class MyDaemonThread extends Thread {

    // Overriding run() method
    public void run() {

        // Infinite loop
        while (true) {
            // printing message
            System.out.println("Deamon thread is running .......");

            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class DaemonExample {
    public static void main(String[] args) {
        
        // Creating thread object
        MyDaemonThread t1 = new MyDaemonThread();
        
        // Setting thread as daemon BEFORE start()
        t1.setDaemon(true);

        // Starting thread
        t1.start();

        // Main thread sleep for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
