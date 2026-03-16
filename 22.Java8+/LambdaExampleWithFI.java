// WAP to demostrating Lambda Example with Functional Interface

// Step 1 : Create Functional interface
// Functional interface
interface Calculator {
    
    // single abstract method
    int add(int value1, int value2);

}

// Step 2: Implement Using Lambda
public class LambdaExampleWithFI {
    public static void main(String[] args) {

        // lambda implementation of Calculator interface
        Calculator calc = (value1, value2) -> value1 + value2;

        // calling the method 
        int result = calc.add(10, 20);

        // printing result
        System.out.println(result);
    }
}
