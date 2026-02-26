// Creating a class that implements Runnable
class MyRunnable implements Runnable {

    // Overriding run method
    @Override
    public void run() {
        // This code will run in separate thread
        System.out.println("Task is running");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        // Creating object of Runnable class
        MyRunnable task = new MyRunnable();

        // Passing Runnable object to Thread
        Thread t = new Thread(task);

        // Starting thread
        t.start(); // This calls run() internally
    }
}