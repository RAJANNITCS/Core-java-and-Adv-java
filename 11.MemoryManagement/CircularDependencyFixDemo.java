// WAP to handle circular dependency 

// class ClassA {
//     private ClassB b;
//     // Constructor requires B
//     public ClassA(ClassB b) {
//         this.b = b;
//     }
// }

// class ClassB {
//     private ClassA a;
//     // Constructor requires A
//     public ClassB(ClassA a) {
//         this.a = a;
//     }
// }

class ClassA {
    private ClassB b;

    // Default constructor (No parameters)
    public ClassA() {} 

    // Setter method to provide ClassB later
    public void setB(ClassB b) {
        this.b = b;
    }
}

class ClassB {
    private ClassA a;

    // Default constructor (No parameters)
    public ClassB() {} 

    // Setter method to provide ClassA later
    public void setA(ClassA a) {
        this.a = a;
    }
}

public class CircularDependencyFixDemo {
    public static void main(String[] args) {
        // ClassA obj = new ClassA(new ClassB(null));

       // Step 1: Create objects using default constructors
        ClassA a = new ClassA(); 
        ClassB b = new ClassB();

        // Step 2: Manually inject the dependencies (Linking)
        a.setB(b); // Now A knows about B
        b.setA(a); // Now B knows about A

        System.out.println("Objects created successfully!");
    }
}