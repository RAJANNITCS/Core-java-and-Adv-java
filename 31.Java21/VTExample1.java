// WAP to crate virtule thread

public class VTExample1 {
    public static void main(String[] args) throws Exception {

        // Crate and start virtual thread directly
        Thread.ofVirtual().start(() -> {

            // Task inside virtual thread 
            System.out.println("Running in " + Thread.currentThread());
        });

        Thread.sleep(1000);

    }
}
