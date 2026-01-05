// WAP to show  access immediate parent class instance variables:

class Animal {
    String sound = "Generic Sound";
}

class Dog extends Animal {
    String sound = "Woof";

    void makeSound() {
        System.out.println(super.sound); // Prints "Generic Sound" (parent's)
        System.out.println(this.sound);  // Prints "Woof" (current object's)
    }
}

public class SuperKeywordsExpV1 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}