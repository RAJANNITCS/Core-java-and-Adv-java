// WAP to demostrating object creation in java 

// Dog is our Class (Blueprint)
class Dog {
    String name;
    String breed;
    int age;

    // Constructor to set up the Dog's initial state
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Method (Behavior)
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        // 'myDog' is an object (an instance) of the Dog class
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);

        // Accessing object's properties (state)
        System.out.println("My dog's name is: " + myDog.name); // Output: My dog's name is: Buddy

        // Calling object's method (behavior)
        myDog.bark(); // Output: Buddy says Woof!

        // Creating another object from the same Dog blueprint
        Dog yourDog = new Dog("Bella", "Poodle", 2);

        System.out.println("Your dog's breed is: " + yourDog.breed);
        
        yourDog.bark(); // Output: Bella says Woof!
    }
}