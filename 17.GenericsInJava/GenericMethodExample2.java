// WAP to demostrating generic method

public class GenericMethodExample2 {
    // Generic method with more the one parameter
    public <T, U> void printTwoItems(T item1, U item2) {
        System.out.println(item1 + " and " + item2);
    }

    public static void main(String[] args) {
        GenericMethodExample2 obj = new GenericMethodExample2();
        obj.printTwoItems(10, "Apple");
        obj.printTwoItems("Hello", 3.14);
    }
}
