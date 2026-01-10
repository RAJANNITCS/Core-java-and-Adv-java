// WAP to demostrating Static Method

public class StaticKeywordsUseAsMethodV1 {

    // static variable
    static int var = getStaticValue();

    static {
        System.out.println("Form static block");
    }

    static int getStaticValue() {
        System.out.println("From static method");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("From main method");
        System.out.println("value of var : " + var);
    }
}