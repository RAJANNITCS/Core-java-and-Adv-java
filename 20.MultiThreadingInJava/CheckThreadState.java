// WAP to check Thread state

public class CheckThreadState extends Thread {
    
    @Override
    public void run() {
        System.out.println(this.getState()); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CheckThreadState t1 = new CheckThreadState();
        System.out.println(t1.getState());  // New 

        t1.start();

        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(100);

        System.out.println(t1.getState()); // TIMED_WAITING

        t1.join();

        System.out.println(t1.getState()); // TERMINATED
    }
}
