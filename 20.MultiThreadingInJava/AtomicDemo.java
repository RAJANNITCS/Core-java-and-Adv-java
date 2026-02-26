import java.util.concurrent.atomic.AtomicInteger;

class BankCounter {
    // 1. This is NOT thread-safe. count++ will lose data.
    private int unsafeCount = 0;

    // 2. This IS thread-safe. incrementAndGet() uses CAS internally.
    private AtomicInteger atomicCount = new AtomicInteger(0);

    public void increment() {
        // Step-by-step: CPU reads, adds, and writes as ONE atomic unit
        unsafeCount++;
        atomicCount.incrementAndGet();
    }

    public int getAtomicValue() {
        System.out.println(this.unsafeCount);
        return atomicCount.get(); // Reads the latest value
    }
}

public class AtomicDemo {
    public static void main(String[] args) {
        BankCounter bankCounter = new BankCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bankCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bankCounter.increment();
            }
        });

        t1.start();
        t2.start();

        System.out.println(bankCounter.getAtomicValue());
    }
}
