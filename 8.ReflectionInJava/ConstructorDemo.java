// WAP to demonstrating by using Regflection create object dynamically

import java.lang.reflect.*;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        try {
            // Access the class
            Class<?> clazz = User.class;

            // Access the constructor 
            Constructor<?> constructor = clazz.getConstructor(String.class);

            // create new instance 
            User user = (User) constructor.newInstance("rohan singh");
            
            // Print the username 
            System.out.println("Username : " + user.getUserName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}