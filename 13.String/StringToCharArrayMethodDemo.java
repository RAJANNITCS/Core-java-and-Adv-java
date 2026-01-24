// WAP to demostrating toCharArray() method

public class StringToCharArrayMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!!!");
        char[] arr = str1.toCharArray();

        for (char c1 : arr) {
            System.out.println("char = " + c1);
        }
    }
}