// Wrtie a program to explain Pass By value
public class PassByValue {

    int a = 10;

    void change(int x) {
        x = 20;
    }

    public static void main(String[] args) {

        PassByValue obj01 = new PassByValue();
        obj01.change(obj01.a);
        System.out.println("value is : "+ obj01.a);

    }
}