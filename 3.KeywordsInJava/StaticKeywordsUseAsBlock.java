// WAP to demostrating static block

public class StaticKeywordsUseAsBlock {
    public static int var1 = 20;
    public static int var2;

    static {
        System.out.println("Static Variable initialized");
        var2 = var1 * 5;
    }

    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println("value of var1 = "+var1);
        System.out.println("value of var2 = "+var2);
    }
}