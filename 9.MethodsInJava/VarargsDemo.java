// WAP to demostrating Varargs 

public class VarargsDemo {

    // This method takes a String and then any number of Integers
    public static void printReport(String title, int... numbers) {
        // Line 1 : Print the title
        System.out.println("---" + title + "---");

        int total = 0; 

        // Line 2 : Varargs 'numbers' is treated as and array.
        // we use a for-each loop to go through it.
        for (int num: numbers) {
            total += num; // Add each number to the total
        }

        // Line 3 : Print the result
        System.out.println("Count of items : "+ numbers.length);
        System.out.println("Sum : " + total);
    }

    public static void main(String[] args) {
        // Calling with 3 arguments
        printReport("Daily Sales", 100, 200, 300);

        // Calling with 0 arguments for the varargs part
        printReport("Empty Report");

        // Calling with an actual array
        int[] extraData = {50, 50, 50};
        printReport("Array Data", extraData);
        
    }
}