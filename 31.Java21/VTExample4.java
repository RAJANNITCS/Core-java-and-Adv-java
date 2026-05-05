// WAP to demostrating Virtual Thread 

public class VTExample4 {
    public static void main(String[] args) throws Exception {

        // Directly start virtual thread
        Thread.startVirtualThread(() -> {

            System.out.println("Shortcut VT : " + Thread.currentThread());

        }); 

        Thread.sleep(1000);
    }
}
