// WAP to demostration interal working of String 

public class StringInteral {
    public static void main(String[] args) {
        // 1. Literal approach: Stored in String Constant Pool
        String s1 = "Java"; 
        
        // 2. New keyword: Stored in Heap (outside pool)
        String s2 = new String("Java"); 

        // 3. Comparison: == checks the reference (address)
        // This will be FALSE because s1 is in Pool and s2 is in Heap
        System.out.println("Using == : " + (s1 == s2)); 

        // 4. Comparison: .equals() checks the content
        // This will be TRUE because both have text "Java"
        System.out.println("Using .equals(): " + s1.equals(s2));

        // 5. StringBuilder for performance (E-commerce Order Summary)
        StringBuilder report = new StringBuilder("Order ID: 101");
        report.append(", Item: Phone"); // Modifies same object
        report.append(", Status: Shipped"); 
        
        System.out.println(report.toString());

    }
}