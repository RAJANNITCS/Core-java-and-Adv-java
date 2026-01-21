// WAP to demostrating jagged Array in java

public class JaggedArrayDemo {
    public static void main(String[] args) {
        // Step 1: Declare a 2D array with 3 rows, but leave columns empty
        int[][] salesData = new int[3][];

        // Step 2: Manually define the size of each row
        salesData[0] = new int[2]; // Row 0 has 2 columns
        salesData[1] = new int[4]; // Row 1 has 4 columns
        salesData[2] = new int[3]; // Row 2 has 3 columns

        // Step 3: Populate the array using nested loops
        int count = 1;
        for (int i = 0; i < salesData.length; i++) {
            // salesData[i].length is the key! It gives the size of THAT specific row
            for (int j = 0; j < salesData[i].length; j++) {
                salesData[i][j] = count++; // Assigning value and incrementing
            }
        }

        // Step 4: Display the Jagged Array
        System.out.println("Jagged Array Structure:");
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                // Print the value followed by a space
                System.out.print(salesData[i][j] + " ");
            }
            // Move to next line after printing one full row
            System.out.println(); 
        }
    }
}