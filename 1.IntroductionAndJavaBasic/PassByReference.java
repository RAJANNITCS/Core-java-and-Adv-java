// Write a program to show why we thing java is pass by reference

class Test {
    int value = 10;
}

public class PassByReference {

    static void changeValue(Test t1) {
        t1.value = 50;
    }

    public static void main(String[] args) {

        Test t1 = new Test();

        System.out.println("Originel value is : "+ t1.value);

        PassByReference.changeValue(t1);

        System.out.println("After change value : "+ t1.value);

    }
    
}
