// WAP to request GC 

public class GCExample {
    public static void main(String[] args) {
        
        // creating an object 
        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        // Making the object eligible for GC
        obj1 = null; // Reference removed
        obj2 = null; // Reference removed

         // Request GC using Runtime
        Runtime.getRuntime().gc(); // GC request
    }
}