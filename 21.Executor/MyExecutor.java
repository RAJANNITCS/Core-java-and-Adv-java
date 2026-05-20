// WAP to demostrating Executor freamwork use 

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {
    
    @Override
    public void execute(Runnable command) {
        command.run();
    }

    public static void main(String[] args) {
        MyExecutor task1 = new MyExecutor();

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        task1.execute(t1);

    }
}
