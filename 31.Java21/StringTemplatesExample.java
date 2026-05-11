// WAP to demostrating String templates 

public class StringTemplatesExample {
    public static void main(String[] args) {

        String name = "Rahul";

        int age = 25;

       // Correct String Template using Text Block
        String result = STR."My name is \{name} and age is \{age}"; 

        System.out.println(result);
    }
}
