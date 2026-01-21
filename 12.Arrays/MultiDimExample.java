// WAP to demostrating multidimension 

public class MultiDimExample {
    public static void main(String[] args) {
        // 1. Initialize a 3x3 Matrix (3 rows, 3 columns)
        int[][] matrix = {
            {1, 2, 3}, // Row 0
            {4, 5, 6}, // Row 1
            {7, 8, 9}  // Row 2
        };

        // 2. Iterate using nested loops
        System.out.println("Matrix Contents:");
        
        // matrix.length gives the number of ROWS
        for (int i = 0; i < matrix.length; i++) {
            
            // matrix[i].length gives the number of COLUMNS in that specific row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            
            // New line after each row
            System.out.println(); 
        }
    }
}