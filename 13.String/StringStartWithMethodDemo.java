// WAP top demostrating startWith(String str)

public class StringStartWithMethodDemo {
    public static void main(String[] args) {
        String str1 = new String("Hello World !!!");

        if (str1.startsWith("Hello")) { 
            System.out.println("Given String start with hello ");
        }  else {
            System.out.println("not start with hello ");
        }
    }
}