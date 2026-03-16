// WAP to demostrating with labda expration code

public class WithLabdaExpDemo {
    public static void main(String[] args) {
        Runnable obj = () -> {
            System.out.println(Thread.currentThread().getName() + " start");
        };

        new Thread(obj).start();

        // or

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
        }).start();
    }
}
