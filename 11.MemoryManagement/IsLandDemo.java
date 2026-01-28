// WAP to demostrating Island of Isolation


class Test {
    Test t;
}

public class IsLandDemo {
    public static void main(String[] args) {
        
        // Step 1 : create two objects
        Test obj1 = new Test(); // obj1 created
        Test obj2 = new Test(); // obj2 created

        // Step 2 : object reference each other
        obj1.t = obj2; // obj1 -> obj2
        obj2.t = obj1; // obj2 -> obj1

        // Step 3 : Remove external references
        obj1 = null; // external reference removed
        obj2 = null; // external reference removed

        // Now obj1 and obj2 form an Island of Isolation
    }
}