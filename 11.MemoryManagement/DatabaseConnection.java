// WAP to use finalize method in our program 

public class DatabaseConnection {

    private String connectionName;

    public DatabaseConnection(String name) {
        this.connectionName = name;
        System.out.println(this.connectionName+ "is Opened. ");
    }

    // This is the old, deprecated way
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing: Closing " + connectionName);
            // Imagine code here to close a database connection
        } finally {
            // Always call the superclass finalize
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Create an object
        DatabaseConnection db = new DatabaseConnection("My_DB");
        
        // Make it eligible for Garbage Collection
        db = null; 

        // Suggesting JVM to run Garbage Collector (Not guaranteed!)
        System.gc(); 

        System.out.println("End of Main method.");
    }
}