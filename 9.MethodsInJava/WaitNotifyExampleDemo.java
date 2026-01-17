// WAP to demostrating Wait notify method in object class

class SharedResource {
    int result;
    boolean isCalculated = false;

    // Method called by Thread-1
    synchronized void calculate() {
        System.out.println("Calculation started....");

        result = 10 + 20;

        isCalculated = true;

        // Notify waiting thread
        notify();

        System.out.println("Calculation completed , notified waiting thread");

    }

    // Method called by Thread - 2 
    synchronized void getResult() {
        while (!isCalculated) {
            try {
                System.out.println("Waiting for calculation...");
                wait(); // Thread goes to waiting state
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Result is: " + result);

    }
}
public class WaitNotifyExampleDemo {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> obj.getResult());
        Thread t2 = new Thread(() -> obj.calculate());

        t1.start();
        t2.start();
    }
}