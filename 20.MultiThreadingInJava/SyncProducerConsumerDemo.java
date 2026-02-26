// Producer-Consumer using synchronized (Single wait-set)

class SyncBuffer {

    private int count = 0;          // current items
    private final int capacity = 2; // max buffer size

    // Producer method
    public synchronized void produce(String name) throws InterruptedException {

        // While buffer is full → wait
        while (count == capacity) {
            System.out.println(name + " waiting (Buffer FULL)");
            wait();  // release lock and go to wait-set
        }

        count++; // add item
        System.out.println(name + " produced. Count: " + count);

        notifyAll(); // wake all waiting threads (producer OR consumer)
    }

    // Consumer method
    public synchronized void consume(String name) throws InterruptedException {

        // While buffer is empty → wait
        while (count == 0) {
            System.out.println(name + " waiting (Buffer EMPTY)");
            wait(); // release lock and wait
        }

        count--; // remove item
        System.out.println(name + " consumed. Count: " + count);

        notifyAll(); // wake all waiting threads
    }
}

public class SyncProducerConsumerDemo {

    public static void main(String[] args) {

        SyncBuffer buffer = new SyncBuffer();

        // Create multiple producers
        for (int i = 1; i <= 3; i++) {
            String name = "Producer-" + i;

            new Thread(() -> {
                try {
                    for (int j = 0; j < 5; j++) {
                        buffer.produce(name);
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Create multiple consumers
        for (int i = 1; i <= 3; i++) {
            String name = "Consumer-" + i;

            new Thread(() -> {
                try {
                    for (int j = 0; j < 5; j++) {
                        buffer.consume(name);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}