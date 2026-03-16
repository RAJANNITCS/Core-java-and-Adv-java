// WAP to demostrating Behavior of this in Lambda Expression

public class ThisInLambdaExp {
    int x = 10;
    public void print() {
        Runnable obj = () -> {
            // "this" refers to Test class instance
            // System.out.println(this.getClass().getName());
            System.out.println(this.x);
        };

        new Thread(obj).start();
    }

    public static void main(String[] args) {
        new ThisInLambdaExp().print();
    }
}
