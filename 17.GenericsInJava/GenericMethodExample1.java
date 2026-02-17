// WAP to demostrating generic method 

public class GenericMethodExample1 {
    // Generic Method
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericMethodExample1 obj = new GenericMethodExample1();

        Integer[] intArray = {2,4,6,8,10,12};
        String[] stringArray = {"hello","World","!!!!!"};

        // Using the generic Method
        obj.printArray(intArray);
        System.out.println("Print Stirng array....");
        obj.printArray(stringArray);
    }
}
