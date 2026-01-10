// WAP to demostrating innner static class

public class StaticKeywordsUseAsInnerClass {

    static class Inner {

        void display() {
            System.out.println("Static nested class Method");
        }
    }

    public static void main(String[] args) {
        StaticKeywordsUseAsInnerClass.Inner obj = new StaticKeywordsUseAsInnerClass.Inner();
        obj.display();
    }
}