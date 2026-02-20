// WAP to demostrating to propase checked exceptions

// Custom checked exception 

import java.io.FileReader;
import java.io.IOException;

class DataAccessException extends Exception {

    // Constructor with message
    public DataAccessException(String message) {
        super(message); // Passing message to parent exception
    }

}

class AccountService {

    // Method declares checked exception
    public void readAccountData() throws DataAccessException {
        try {
            // Trying to open account data file
            FileReader file = new FileReader("accounts.txt");

        } catch (IOException e) {

            // Wrap low-level exception into business-level exception
            throw new DataAccessException("Unable to read account data");
        }
    }
}

public class BankApplicationDemo {
    public static void main(String[] args) {

        AccountService service = new AccountService();

        try {
            service.readAccountData(); // Calling method
        } catch (DataAccessException e) {

            // Handling the recoverable situation
            System.out.println("Please try again later.");
        }
    }
}
