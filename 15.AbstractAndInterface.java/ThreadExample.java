class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Task running...");
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        Runnable task = new MyTask();   // Abstraction
        Thread thread = new Thread(task);
        thread.start();
    }
}
