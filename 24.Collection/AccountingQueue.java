// WAP to demostrating queue using in accounting

import java.util.LinkedList;
import java.util.Queue;

class Transaction {
    int id; // transaction id

    Transaction(int id) {
        this.id = id;
    }
}

public class AccountingQueue {
    public static void main(String[] args) {
        
        // Create queue using LinkedList
        Queue<Transaction> queue = new LinkedList<>();

        // Add transactions
        queue.offer(new Transaction(1));
        queue.offer(new Transaction(2));
        queue.offer(new Transaction(3));

        // Process Transactions
        while (!queue.isEmpty()) {
            Transaction t = queue.poll(); // remove from head

            System.out.println("Procesing Transaction ID : " + t.id);
        }
    }
}
