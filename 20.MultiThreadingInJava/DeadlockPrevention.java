// WAP to Preventing deadlock

public class DeadlockPrevention {
    // Creating first lock
    private static final Object lock1 = new Object();

    // Creating second lock
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Creating thread 1 
        Thread t1 = new Thread(() -> {

            synchronized(lock1) { // thread 1 acquired lock1
                System.out.println("Thread 1 acquired lock 1");

                synchronized(lock2) { // thread 1 acquired lock2
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        // Creating Thread 2
        Thread t2 = new Thread(() -> {

            synchronized(lock1) { // thread 2 acquired lock1
                System.out.println("Thread 2 acquired lock1");

                synchronized(lock2) { // thread 2 acquired lock2
                    System.out.println("Thread 2 acquired lock2");
                }
            }
        });

        t1.start(); // thread 1 start 
        t2.start(); // thread 2 start 
    }
}
