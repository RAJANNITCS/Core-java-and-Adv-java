// WAP to demostrating Soft Reference in java

import java.lang.ref.SoftReference;

public class SoftRefDemo {
    public static void main(String[] args) {
        // Create a Soft Reference
        // Imagine this is a heavy image in an E-commerce app
        SoftReference<String> cache = new SoftReference<>(new String("Large_Image_Data"));

        // Even after calling GC, Soft References usually survive 
        // because we have plenty of free RAM right now.
        System.gc();
        
        if (cache.get() != null) {
            System.out.println("Image still in cache");
        } else {
            System.out.println("JVM deleted image to save memory");
        }
        
    }
}