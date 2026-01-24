// WAP to demostrating substring(int index) method

public class StringSubStringMethodDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello World!!!");

        // index to end 
        // String subString  = s1.substring(3);

        // from index i to j - 1;
        String subString = s1.substring(3,5);

        // System.out.println("sub String of given String = " + subString);

        System.out.println("Sub string of given string index form 3 to 5 = " + subString);
    }
}