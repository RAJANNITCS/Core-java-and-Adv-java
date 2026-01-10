// WAP to demostrating reflection change final variable 

import java.lang.reflect.Field;

public class ReflectionTest {
    // A final filed - the compiler might inline this !
    private final String accountType = "SAVINGS";

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) throws Exception {
        ReflectionTest obj = new ReflectionTest();

        // 1. Get the field object for 'accountType'
        Field field  = ReflectionTest.class.getDeclaredField("accountType");

        // 2. Make the private field accessible 
        field.setAccessible(true);

        // 3. Type to change the value from "SAVINGS" to "CURRENT"
        field.set(obj, "CURRENT");

        // 4. check the results 
        System.out.println("Field value via Reflection : " + field.get(obj));
        System.out.println("Field value via Getter " + obj.getAccountType());
        
    }
}