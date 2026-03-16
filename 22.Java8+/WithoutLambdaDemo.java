// WAP to demostrating without lambda expration code

public class WithoutLambdaDemo {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " = start");
            }
        };

        new Thread(obj).start();
    }
}
