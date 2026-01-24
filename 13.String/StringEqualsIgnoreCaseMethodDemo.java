// WAP to demostrating equalsIgnoreCase(String anotherString) method

public class StringEqualsIgnoreCaseMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!!");
        String str2 = new String("hello world !!!!");

        boolean isMatch = str1.equalsIgnoreCase(str2);

        if (isMatch) {
            System.out.println("String are match");
        } else {
            System.out.println("String not match");
        }
    }
}