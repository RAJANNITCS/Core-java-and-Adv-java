// WAP to demostrating Weak reference 

import java.lang.ref.WeakReference;

public class WeakRefDemo {
    public static void main(String[] args) {
        // 1. Create a Strong Reference
        StringBuilder data = new StringBuilder("Very important Data");

        // 2. Create a Weak Reference pointing to that data
        WeakReference<StringBuilder> weakRef = new WeakReference<StringBuilder>(data);

        // 3. Make the Strong Reference null
        // Now the object is ONLY held by a Weak Reference
        data = null;

        // 4. Check if it still exists
        System.out.println("Before GC: " + weakRef.get());

        // 5. Suggest a Garbage Collection
        System.gc();

        // 6. Check again 
        // It will likely be null because GC clears Weak Reference immediately
        System.out.println("After GC : " + weakRef.get());
        
    }
}