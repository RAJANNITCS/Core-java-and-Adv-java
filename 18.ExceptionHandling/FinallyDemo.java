// WAP to demostrating what happen when try catch return statement

public class FinallyDemo {

    public static int testMethod() {
        try {
            System.out.println("Inside Try");
            return 10; // return statement
        } finally {
            System.out.println("Inside finally");
        }
    }
    public static void main(String[] args) {
        int result =  testMethod();
        System.out.println("Return value : " + result);
    }
}
