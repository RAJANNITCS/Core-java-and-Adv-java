// WAP to demonstrating By using Reflection invoking methods dynamically

import java.lang.reflect.Method;

class Calculator {
    // private int add(int var1, int var2) {
    //     return (var1 + var2);
    // }
}

public class MethodInvokeDemo {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();

            // Access the class
            Class<?> clazz = calculator.getClass();

            // Access the private method 
            Method addMethod = clazz.getDeclaredMethod("add",int.class, int.class);

            // Make the method accessible
            addMethod.setAccessible(true);

            // Invoke the method 
            int result = (int) addMethod.invoke(calculator, 5,10);

            System.out.println("Result : " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}