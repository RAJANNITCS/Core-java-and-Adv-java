// WAP to detect dead lock using ThreadMXBean api.

import java.lang.management.ManagementFactory; // Provides JVM management interfaces
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean; // Interface to monitor threads

public class DeadlockDetector {
    public static void main(String[] args) {

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
