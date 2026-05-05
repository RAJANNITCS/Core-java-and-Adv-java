// WAP to demostrating Virtual thread 

public class VTExample2 {
    public static void main(String[] args) throws Exception {

        // Create virtual thread but do not start yet 
        Thread vt = Thread.ofVirtual().unstarted(() -> {
            System.out.println("Manual start " + Thread.currentThread());
        });

        // Do some logic 

        vt.start(); // Start manually 

        Thread.sleep(1000);

    }
}

