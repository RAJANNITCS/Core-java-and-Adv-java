// WAP to demostrating the working of start method in thread class

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running....."); // code executed by new thread
    }

}
public class StartMethodDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create thread object

        t1.start(); // Start new thread
    }
}
