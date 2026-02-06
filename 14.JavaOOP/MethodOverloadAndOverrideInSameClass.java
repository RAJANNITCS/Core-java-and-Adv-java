// WAP to demostrating what issue we will face if we use MethodOverload and MethodOverriding
// same class

// Parent class
class Animal {

    // Overloaded method
    void eat(Animal a) {
        System.out.println("Animal eats Animal food");
    }
}

// Child class
class Dog extends Animal {

    // Overridden method
    @Override
    void eat(Animal a) {
        System.out.println("Dog eats Animal food");
    }

    // Overloaded method (NOT overridden)
    void eat(Dog d) {
        System.out.println("Dog eats Dog food");
    }
}

public class MethodOverloadAndOverrideInSameClass {
    public static void main(String[] args) {

        Animal a = new Dog();  // Parent reference, child object
        Dog d = new Dog();

        a.eat(d);   // ❓ Which method?
    }
}
