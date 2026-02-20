// WAP to demostrating try and catch block

public class TryAndCatchBlockDemo {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 0;

        try {
            int ans =  (value1 / value2);
            System.out.println("Answer : " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error : Division by 0!");
        }
        
    }
}
