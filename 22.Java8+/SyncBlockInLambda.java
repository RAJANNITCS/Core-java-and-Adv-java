// WAP to demostrating synchronized block with lambda exprection

public class SyncBlockInLambda {
    public static void main(String[] args) {

        Object lock = new Object(); // shared lock object 

        Runnable task = () -> {
            synchronized(lock) { // synchronized block inside lambda
                System.out.println(Thread.currentThread().getName() + " is executing....");
            }
        };

        // creating mulitple threads 
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
