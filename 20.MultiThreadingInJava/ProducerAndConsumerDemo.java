// WAP to Imagine a Warehouse System where a Supplier (Producer) adds stock and a Store (Consumer) removes stock.

import java.util.LinkedList;
import java.util.Queue;

class Warehouse {
    private final Queue<Integer> inventory = new LinkedList<>();
    private final int MAX_CAPACITY = 10;

    // Supplier adds items
    public synchronized void addStock(int item) throws InterruptedException {
        // Step 1 : Check if warehouse is full
        while (inventory.size() == MAX_CAPACITY) {
            System.out.println("Warehouse full . Supplier is waiting....");
            
            //Thread releases the lock and goes to 'Wait Set'
            wait();
        }

        // Step 2 : Add the item
        inventory.add(item);
        System.out.println("Supplier added item. Stock : " + inventory.size());

        // Step 3 : Notify the Store that they can now buy items
        notifyAll();
    }

    // Store removes items
    public synchronized void buyItem() throws InterruptedException {
        // Step 1: Check if warehosue is empty 
        while (inventory.isEmpty()) {
            System.out.println("Warehouse empty . Store is waiting .....");

            // Thread releases the lock and goes to 'Wait Set'
            wait();
        }

        // Step 2 : Remove the item
        inventory.poll();
        System.out.println("Store bought item . Stock : " + inventory.size());

        // Step 3 : Notify the Supplier that there is now space
        notifyAll();
    }

}

public class ProducerAndConsumerDemo {
    public static void main(String[] args) {
        // Create the shared resource (The Monitor Object)
        Warehouse myWarehouse = new Warehouse();

        // 1. Thread for Supplier: It will try to add 10 items
        Thread supplierThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    myWarehouse.addStock(i); // Calling synchronized method
                    Thread.sleep(500); // Wait 0.5 sec to simulate work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Supplier-Thread");

        // 2. Thread for Store: It will try to buy 10 items
        Thread storeThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    myWarehouse.buyItem(); // Calling synchronized method
                    Thread.sleep(1500); // Wait 1.5 sec (Store is slower than Supplier)
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Store-Thread");

        // Start both threads
        supplierThread.start();
        storeThread.start();
    }
}
