// WAP to demostration uses of finalized method 

public class FinalizedMethod {

    public static void main(String[] args) {

        // FinalizedMethod obj1 = new FinalizedMethod();
        // FinalizedMethod obj2 = new FinalizedMethod();

        // obj1 = null;
        // obj2 = null;

        System.gc(); // Requesting Garbage Collector
    }

    @Override
    protected void finalize() {
        System.out.println("This method runs before garbage collection");
    }
}
