// WAP to create thread by extending thread class

// Creating a class that extends Thread
class MyThread extends Thread {

    // Override run() method 
    @Override
    public void run() {
        // loop for 5 time
        for (int i = 0; i < 5; i++) {
            // Print current thread name and number
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

// Main class
public class ExtendThreadClass {
    public static void main(String[] args) {

        // Create object of thread
        MyThread t1 = new MyThread();
        
        // Start thread
        t1.start(); // This calls run() internally
    }
}
