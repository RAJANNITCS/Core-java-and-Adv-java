// WAP to demostrating break statement 

public class JumpBreakStatementDemo {
    public static void main(String[] args) {
        int var = 10;
        for (int i = 0; i <= var; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("i value is = "+i);
        }
    }
}