// WAP to demostrating Using super in Lambda

class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

public class SuperInLambdaExp extends Parent{
    
    void show () {
        Runnable obj = () -> {
            // calling parent method
            super.display();
        };

        new Thread(obj).start();
    }

    public static void main(String[] args) {
        
        new SuperInLambdaExp().show();
    }
}
