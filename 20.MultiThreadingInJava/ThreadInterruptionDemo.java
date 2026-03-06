// WAP to demostrating ThreadInterruption 

// Createing custome thred classs 
class MyClass extends Thread {

    @Override
    public void run() {

        // Loop to simulate long running task
        while (!Thread.currentThread().isInterrupted()) {

            // Printing message
            System.out.println("Thread is running ......");

            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                // Restore interupt flag
                Thread.currentThread().interrupt();

                System.out.println("Thread was interrupted during sleep");

                break; // Exit loop safely
            }
        }

        System.out.println("Thread exiting safely");
    }
}


public class ThreadInterruptionDemo {
    public static void main(String[] args) throws Exception {

        // Create thread object
        MyClass task = new MyClass();

        // Start thread
        task.start();

        // Let it run for 3 seconds
        Thread.sleep(3000);

        System.out.println("Thread interrupted start");

        // Interrupt thread
        task.interrupt();
    }
}