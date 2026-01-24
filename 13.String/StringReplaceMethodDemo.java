// WAP to demostrating replace(String oldStr, String newStr) method

public class StringReplaceMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!!");

        String str2 = str1.replace("l", "x");

        System.out.println("After change string = " + str2);
    }
}