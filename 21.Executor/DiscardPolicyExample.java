// WAP to demostrating Discard Ploicy 

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DiscardPolicyExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(

                2,
                2,
                10,
                TimeUnit.SECONDS,

                new ArrayBlockingQueue<>(2),

                new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 1; i <= 10; i++) {

            int taskId = i;

            executor.submit(() -> {

                System.out.println(
                        "Executing : " + taskId);

                try {

                    Thread.sleep(5000);

                } catch (Exception e) {

                    e.printStackTrace();
                }
            });
        }
    }
}
