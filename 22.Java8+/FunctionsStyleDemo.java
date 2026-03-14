// WAP to demostrating functional programing 

interface Calculator {
    int calculate(int value1, int value2);
}

public class FunctionsStyleDemo {
    public static void main(String[] args) {

        // Lambda function assigned to variable
        Calculator add = (a,b) -> a + b;
        System.out.println(add.calculate(10, 20));
    }
}
