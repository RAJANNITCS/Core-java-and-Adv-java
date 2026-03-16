// WAP to demostrating Behavior of this in Anonymous Inner Class

public class ThisInAnonClass {
    public void print() {
        int x = 10;
        Runnable obj = new Runnable() {
            int x = 20;
            @Override
            public void run() {

                // "this" refers to anonymous class object
                // System.out.println(this.getClass().getName());
                System.out.println(this.x);

            }
        };

        new Thread(obj).start();
    }

    public static void main(String[] args) {

        new ThisInAnonClass().print();
        
    }
}
