// WAP to demostrating instance variable use in lambda.

public class InstanceVarInLambda {

    int count = 0;

    public void test() {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                this.count++;
            }
        };

        new Thread(r).start();
    }

    public static void main(String[] args) throws InterruptedException {
        InstanceVarInLambda obj = new InstanceVarInLambda();
        obj.test();
        Thread.sleep(1000);
        System.out.println(obj.count);
    }
    
}
