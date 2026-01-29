// WAP to demostrating multiple inheritance 

// Interface 1
interface Camera {

    // A default method (Java 8+)
    default void takePhoto() {
        System.out.println("Taking photo with camera software");
    }
}

// Interface 2
interface SocialApp {
    
    // Another default method with the same name
    default void takePhoto() {
        System.out.println("Taking photo with Social App Filters");
    }

}

// This class implements both
class SamrtPhone implements Camera, SocialApp {

    // MANDATORY: We must override this because both parents have the same method
    @Override
    public void takePhoto() {
        // Option 1: Provide custom logic
        System.out.println("Smartphone is deciding which logic to use...");
        
        // Option 2: Explicitly call one of the parents
        Camera.super.takePhoto(); 
    }
}

public class HandleMultipleInheritanceDemo {
    public static void main(String[] args) {
        SamrtPhone myPhone = new SamrtPhone();
        myPhone.takePhoto();
    }
}