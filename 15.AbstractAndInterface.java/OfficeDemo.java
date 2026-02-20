// WAP to demostrating marker interface

// 1. Define the Marker Interface
// It has no methods. It is just a "tag".
interface PermissionToPrint {
}

// 2. A class that is ALLOWED to print 
class SecureDocument implements PermissionToPrint {
    String content = "This is a secret report.";
}

// 3. A class that is NOT ALLOWED to print
class NormalNote {
    String content = "Buy milk";
}

// 4. The Printer logic
class OfficePrinter {
    public void print(Object doc) {
        // We check if the object the "Tag" (Marker Interface)
        if (doc instanceof PermissionToPrint) {
            System.out.println("Printing : " + doc.toString());
        } else {
            // if the tag is missing , we deny the action
            System.out.println("Error : No permission to print this document type.");
        }
    }
}

public class OfficeDemo {
    public static void main(String[] args) {
        OfficePrinter printer = new OfficePrinter();
        
        SecureDocument secureDocument = new SecureDocument();
        NormalNote normalNote = new NormalNote();

        printer.print(secureDocument);
        printer.print(normalNote);
    }
}
