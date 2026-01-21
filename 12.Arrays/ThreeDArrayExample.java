// WAP to demostrating three dimenstion array

public class ThreeDArrayExample {
    public static void main(String[] args) {
        // 1. Create a 3D array: 2 slices, 3 rows, 4 columns
        int[][][] cube = new int[2][3][4];

        // 2. Fill the array with values using triple nested loops
        int count = 1;
        for (int i = 0; i < cube.length; i++) { // Depth/Slice
            for (int j = 0; j < cube[i].length; j++) { // Row
                for (int k = 0; k < cube[i][j].length; k++) { // Column
                    cube[i][j][k] = count++;
                }
            }
        }

        // 3. Print the 3D array
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Slice (Layer): " + i);
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    // Print values in a row
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println(); // New line after each row
            }
            System.out.println("---"); // Separator after each slice
        }
    }
}