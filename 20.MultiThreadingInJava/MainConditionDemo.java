// WAP to demostrating newCondition demo method

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class ProducerConsumerExample { 
    private ReentrantLock lock = new ReentrantLock();

    // Create condition 
    private Condition condition = lock.newCondition();

    private int data = 0;
    private boolean avaibleble = false;

    // Producer method 
    public void produce() throws InterruptedException {

        lock.lock();

        try {

            while (avaibleble) {
                condition.await(); // Wait if data already available
            }

            data = 100; // Produce data
            System.out.println("Produced : " + data);

            avaibleble  = true;

            condition.signal(); // Wake up consumer
        } finally {
            lock.unlock();
        }
    }

    // Consumer method 
    public void consume() throws InterruptedException {
        lock.lock();

        try {
            while (!avaibleble) {
                condition.await(); // Wait until data available
            }

            System.out.println("Consumed : " + data);

            avaibleble = false;

            condition.signal(); // Wake up producer
        } finally {
            lock.unlock();
        }
    }
}
public class MainConditionDemo {
    public static void main(String[] args) {
        ProducerConsumerExample producerConsumerExample = new ProducerConsumerExample();
        Thread producer = new Thread(() -> {
            try {
                producerConsumerExample.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                producerConsumerExample.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();
    }
}
