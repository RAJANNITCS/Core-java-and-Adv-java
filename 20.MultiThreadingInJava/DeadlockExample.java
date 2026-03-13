// WAP to demostranting deadlock 

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadlockExample {
    // First shared resource
    private static final Object lock1 = new Object();

    // Second shared resource
    private static final Object lock2 = new Object();

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {

            synchronized (lock1) { // Thread 1 acquires lock1
                System.out.println("Thread1 acquired lock1");

                try {
                    Thread.sleep(100); // pause to simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) { // Thread1 tries to acquire lock2
                    System.out.println("Thread1 acquired lock2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {

            synchronized (lock2) { // Thread2 acquires lock2
                System.out.println("Thread2 acquired lock2");

                try {
                    Thread.sleep(100); // pause
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) { // Thread2 tries to acquire lock1
                    System.out.println("Thread2 acquired lock1");
                }
            }
        });

        t1.start(); // start thread1
        t2.start(); // start thread2

        // Start a deadlock detector thread
        new Thread(() -> {
            try {
                Thread.sleep(1000); // wait for deadlock to happen
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            detectDeadlock();
            
        }).start();
    }


    private static void detectDeadlock() {
        // Step 1 : Get ThreadMxBean instance from jvm
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        // Step 2 : Detect deadlock threads
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();

        // Step 3 : Check if deadlock exists
        if (deadlockedThreads != null) {

            System.out.println("Deadlock detected!");

            // Step 4: Get detailed information of deadlocked threads
            ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreads);

            // Step 5: Print information for each deadlocked thread
            for (ThreadInfo threadInfo : threadInfos) {

                System.out.println("Thread Name: " + threadInfo.getThreadName());

                System.out.println("Waiting for lock: " + threadInfo.getLockName());

                System.out.println("Lock owned by: " + threadInfo.getLockOwnerName());

                System.out.println("-----------------------------------");
            }

        } else {
            System.out.println("No deadlock detected.");
        }
    }
    
}
