// WAP to demostrating contains(String str) Method

public class StringContainsMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!!");
        boolean isPresent = str1.contains("Hello");

        if (isPresent) {
            System.out.println("String present in given string");
        } else {
            System.out.println("string not present");
        }
    }
}