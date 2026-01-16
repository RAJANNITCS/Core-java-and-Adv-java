// WAP to demostrating static block

public class DatabaseConfig {
    // Static variable shared by the whole app
    public static String dbUrl;

    // Static block to initialize complex configuration
    static {
        System.out.println("Static Block: Loading Database Configuration...");
        try {
            // Imagine reading this from a secure vault or file
            dbUrl = "jdbc:mysql://production-server:3306/bank_db";
            
            // Registering the driver happens only once
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Critical Error: Failed to load DB config!");
        }
    }

    // Constructor
    public DatabaseConfig() {
        System.out.println("Constructor: Creating an instance of DatabaseConfig");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: Starting...");
        
        // Creating two objects to see how many times static block runs
        // DatabaseConfig obj1 = new DatabaseConfig();
        // DatabaseConfig obj2 = new DatabaseConfig();
    }
}