// NOTE: This code will only execute successfully in Java JDK 6 or older.
// In modern Java (JDK 7+), it will compile but give an error when running
// (Error: Main method not found).
public class RunWithoutMain {
    
    // This is the static initialization block.
    // Code here runs automatically when the class is loaded by the JVM.
    static {
        System.out.println("--- Static Block Code Executed ---");
        System.out.println("Hello! This code ran without a main method (in older Java).");
        
        // This line forcefully stops the program before the JVM can check for main().
        System.exit(0); 
    }
}
// How to run this (in an old JDK):
// 1. Compile: javac RunWithoutMain.java
// 2. Run:     java RunWithoutMain
// Output (in JDK 6): 
// --- Static Block Code Executed ---
// Hello! This code ran without a main method (in older Java).