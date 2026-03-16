// WAP to capture variable in lambda 
public class LambdaCaptureExample {
    public static void main(String[] args) {
        int value = 10;

        Runnable obj = () -> {
            System.out.println(value);
        };

        new Thread(obj).start();
    }
}
