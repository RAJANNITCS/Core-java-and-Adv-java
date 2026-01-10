//WAP to demostrating Return statement 

class Calculate {

    public static int calculateSumOfTwoNumber(int num1, int num2) {
        return (num1 + num2);
    }

}

public class JumpReturnStatementDemo {
    public static void main(String[] args) {
        System.out.println("sum of 10 and 12 is = " + Calculate.calculateSumOfTwoNumber(10, 12));
    }
}