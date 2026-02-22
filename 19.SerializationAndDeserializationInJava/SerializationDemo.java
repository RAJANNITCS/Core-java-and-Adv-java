// WAP to demostrating Serialization and Deserialization

// The class must implement Serializable

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class LoanApplication implements Serializable {
    // Manually defined version ID for compatibility
    private static final long serialVersionUID = 1L;

    private String applicantName;
    private double loanAmount;

    // We don't want to save the temporary session token to a file 
    private transient String sessionToken;

    public LoanApplication(String name, double amount, String token) {
        this.applicantName = name;
        this.loanAmount = amount;
        this.sessionToken = token;
    }

    @Override
    public String toString() {
        return "Name : " + this.applicantName + ", Amount : " + this.loanAmount + ", Token: " + this.sessionToken;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        LoanApplication app = new LoanApplication("rajan singh",1000000, "SECRET_XYZ");

        // ---------- SERIALIZATION -----------
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("loan.ser"))) {
            // Write the object to a file called loan.ser
            out.writeObject(app);
            System.out.println("Object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- DESERIALIZATION ---
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("loan.ser"))) {
            // Read the object back from the file
            LoanApplication savedApp = (LoanApplication) in.readObject(); 
            System.out.println("Object has been deserialized");
            // The sessionToken will be NULL because it was transient
            System.out.println("Data: " + savedApp); 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}