// WAP to show unary operators 

public class UnaryOperatorsExample {
    public static void main(String[] args) {
        // Integer declared
        int a = 10;
        int b = 10;
        boolean isActive = true;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        //Numeric Negation
        int c = -a;
        System.out.println("Numeric Negation = "+ c);

        // Logical Negation
        System.out.println(!isActive);
    }
}