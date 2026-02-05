// WAP to demostrating Inheritance 

// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks ");
    }
}

// Child class 
class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

}

// Child class 
class Cow extends Animal {

    @Override
    public void sound() {
        System.out.println("Cow moos");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal obj = null;

        obj = new Dog();
        obj.sound();

        obj = new Cat();
        obj.sound();

        obj = new Cow();
        obj.sound();
        
    }
}
