
// Step 3: Import the class from the other package
import pack1.SavingsAccount; 

public class MainApp {
    public static void main(String[] args) {
        // Create an object of the imported class
        SavingsAccount account = new SavingsAccount(); 
        
        // Call the method
        account.showBalance(); 
    }
}