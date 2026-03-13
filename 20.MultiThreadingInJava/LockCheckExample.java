// WAP to check how to check lock

public class LockCheckExample {
    
    // Shered object which use in synchronization
    private static final Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            // synchronized block acquires lock on "lock" object
            synchronized(lock) {

                boolean isLock = Thread.holdsLock(lock);

                System.out.println("Does Thread hold lock ? " + isLock);
            }

            boolean isLock = Thread.holdsLock(lock);

            System.out.println("Out side block does thread hold the lock ? " + isLock);
        });

        // Start thread
        t1.start();
    }
}
