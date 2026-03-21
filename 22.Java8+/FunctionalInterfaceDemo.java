// WAP to createing and using functional interface with lambda expression

// defining functional interface
@FunctionalInterface 
interface Calculator {

    // only ONE abstract method
    public int sum (int value1, int value2);
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // using lambda expression 
        Calculator calc = (int value1, int value2) -> value1 + value2;

        // calling method 
        int total = calc.sum(20, 30);
        System.out.println(total);
    }
}
