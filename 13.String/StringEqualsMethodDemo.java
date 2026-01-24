// WAP to demostrating equals(String str) method

public class StringEqualsMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!!");

        boolean isMatch = str1.equals("Hello World !!!!");

        if (isMatch) {
            System.out.println("same string");
        } else {
            System.out.println("different string");
        }
    }
}