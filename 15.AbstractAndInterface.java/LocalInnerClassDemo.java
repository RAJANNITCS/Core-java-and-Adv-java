// WAP to demostrating Local Inner class

class OuterClass {
    public void outerMethod() {
        final int x = 98; // Variable must be final or effectively final
        System.out.println("Inside outerMethod");
        
        // Method-Local Inner Class
        class Inner {
            void innerMethod() {
                // Can access the local variable 'x'
                System.out.println("x = " + x);
            }
        }
        
        // Instantiate the local inner class
        Inner inner = new Inner();
        inner.innerMethod();
    }
}


public class LocalInnerClassDemo {
     public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
