// WAP to demostrating lockInterruptible method

import java.util.concurrent.locks.ReentrantLock;

class Worker1 extends Thread {

    private ReentrantLock lock;

    public Worker1(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock(); // acquire lock
        try {
            System.out.println("Worker1 acquired lock");
            Thread.sleep(10000); // hold lock 10 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class Worker2 extends Thread {

    private ReentrantLock lock;

    public Worker2(ReentrantLock lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            System.out.println("Worker2 trying to get lock...");
            
            lock.lockInterruptibly();   // can be interrupted

            try {
                System.out.println("Worker2 acquired lock");
            } finally {
                lock.unlock();
            }

        } catch (InterruptedException e) {
            System.out.println("Worker2 interrupted while waiting");
        }
    }
}

public class LockInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        Worker1 t1 = new Worker1(lock);
        Worker2 t2 = new Worker2(lock);

        t1.start();

        t2.start();

        t2.interrupt();
    }
}
