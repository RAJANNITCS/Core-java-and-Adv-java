// We implement Runnable to define the task
class PaymentTask implements Runnable {
    private String paymentId;

    public PaymentTask(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public void run() {
        // This code runs inside a separate thread
        System.out.println("Starting processing for: " + paymentId);
        
        try {
            // Simulate time taken to talk to a Bank API (2 seconds)
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Payment Completed: " + paymentId);
    }
}

public class MultitaskingDemo {
    public static void main(String[] args) {
        // Create two separate tasks
        PaymentTask task1 = new PaymentTask("TXN_1001");
        PaymentTask task2 = new PaymentTask("TXN_1002");

        // Create two threads to run these tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start both threads
        // This is Multitasking! Both run at the same time.
        thread1.start(); 
        thread2.start(); 

        System.out.println("Main thread is free to do other work...");
    }
}