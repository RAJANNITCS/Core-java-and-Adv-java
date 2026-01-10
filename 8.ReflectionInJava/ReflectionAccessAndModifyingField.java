// WAP to demostration using Reflection we can Accessing and Modifying Fields

import java.lang.reflect.Field;

class Person {
    // private String name = "Rohan Singh";
}

public class ReflectionAccessAndModifyingField {
    public static void main(String[] args) {
        try {
            Person person = new Person();

            //Access the class 
            Class<?> clazz = person.getClass();

            //Access the private field 
            Field nameField = clazz.getDeclaredField("name");

            //Make the field accessible
            nameField.setAccessible(true);

            //Get the value of the field
            String name = (String) nameField.get(person);

            System.out.println("Original Name : " + name);

            // Modify the value of the field
            nameField.set(person, "Jane Doe");

            System.out.println("Modified name : " + nameField.get(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}