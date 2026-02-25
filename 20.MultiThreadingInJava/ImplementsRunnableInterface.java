// WAP to create thread by implements runnable interface

// Creating class implementing Runnable 
class MyRunnable implements Runnable {

    // Override run() method
    @Override
    public void run() {

        // Loop 5 time 
        for (int i = 0; i < 5; i++) {
            // print current thread name
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ImplementsRunnableInterface {
    public static void main(String[] args) {
        // Create runnable object
        MyRunnable task = new MyRunnable();

        // Pass runnable to Thread constructor
        Thread t1 = new Thread(task);

        // Start thread
        t1.start();
    }
}
