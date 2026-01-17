// WAP to demostrating Wrapper example 

public class WrapperExample {
    public static void main(String[] args) {
        // --- BOXING ---
        // int primitiveInt = 25;
        // Manually wrapping (Old way, deprecated since Java 9)
        // Integer manualWrapper = Integer.valueOf(primitiveInt); 
        
        // Autoboxing (Modern way)
        // Integer autoWrapper = 50; 

        // --- UNBOXING ---
        // Automatically extracting the primitive value
        // int result = autoWrapper + 10; 

        // --- UTILITY METHODS ---
        // String ageString = "30";
        // Converting String to primitive int
        // int age = Integer.parseInt(ageString); 

        // Comparing two wrapper objects
        Integer val1 = 127;
        Integer val2 = 127;
        // This is TRUE because of the Integer Cache (-128 to 127)
        System.out.println("Cache Check: " + (val1 == val2)); 

        Integer val3 = 128;
        Integer val4 = 128;
        // This is FALSE because 128 is not cached; they are different objects in memory
        System.out.println("Outside Cache Check: " + (val3 == val4));
    }
}