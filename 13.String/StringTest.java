// WAP to demostrating String immutablility 

public class StringTest {
    public static void main(String[] args) {
        // Step 1: Create a string
        String s1 = "Hello"; 
        
        // Step 2: Try to "change" it by appending
        // This does NOT change "Hello". It creates a NEW string "Hello World"
        s1.concat(" World"); 
        
        // Step 3: Print s1
        System.out.println(s1); // Output: Hello (Original stayed the same!)
        
        // Step 4: To see the change, you must catch the new object
        String s2 = s1.concat(" World");
        System.out.println(s2); // Output: Hello World
        
    }
}