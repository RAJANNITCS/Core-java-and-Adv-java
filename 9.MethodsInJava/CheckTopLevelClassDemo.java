// WAP to demostrating is top level classs are private or protected


// This will NOT compile
// private class SecretDatabaseConnector { 
//     // The compiler will say: "modifier private not allowed here"
// }

// // This will also NOT compile
// protected class BaseHelper {
//     // The compiler will say: "modifier protected not allowed here"
// }

// This is a top-level class with DEFAULT access (no keyword)
// It is effectively "private to this package"
class InternalProcessor { 
    
    // Method to do some work
    void process() {
        System.out.println("Processing internally...");
    }
}

// This is the Public class that others will call
public class CheckTopLevelClassDemo {
    public static void main(String[] args) {
        // We can use InternalProcessor here because it's in the same package
        InternalProcessor p = new InternalProcessor();
        p.process();
    }
}