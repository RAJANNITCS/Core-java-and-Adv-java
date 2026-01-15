// WAP to demostrating public Access modifier

class MathUtils {

    public static int add(int var, int var1) {
        return (var + var1);
    }
}

public class AccessModifierPublicDemo {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(10, 15)); // accessible anywhere
    }
}