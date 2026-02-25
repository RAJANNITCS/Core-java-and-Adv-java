// WAP to demostrating Yield method

public class YieldMethodDemo extends Thread {
    
    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
    public static void main(String[] args) {
        YieldMethodDemo t1 = new YieldMethodDemo();
        t1.start();
        // Thread.yield();
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

