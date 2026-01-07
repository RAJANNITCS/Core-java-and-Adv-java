// WAP to shor static variable

class Test {
    // static variable in test class
    static int var = 10;
}

class UpdateNumber {
    
    static void updateNumber(int value) {
        Test.var += value;
    }

}

public class StaticVariable {
    public static void main(String[] args) {
        Test.var = 40;
        System.out.println("Before update number = "+Test.var);
        UpdateNumber.updateNumber(50);
        System.out.println("After number update = "+Test.var);
    }
}