// WAP to demonstrating continue statement 

public class JumpContinueStatementDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i value is = "+i);
        }
    }
}