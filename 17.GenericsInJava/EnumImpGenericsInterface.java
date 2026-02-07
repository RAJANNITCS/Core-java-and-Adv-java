// WAP to demostrating enum implements generic interface

interface Calculator<T> {
    T calculate(T a, T b);
}

enum ArithmeticOperation implements Calculator<Integer> {
    ADD {
        @Override
        public Integer calculate(Integer a, Integer b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public Integer calculate(Integer a, Integer b) {
            return a - b;
        }
    }

    // Additional operations can be added in the same way.
}

public class EnumImpGenericsInterface {
    public static void main(String[] args) {
        int result1 = ArithmeticOperation.ADD.calculate(20, 30);
        int result2 = ArithmeticOperation.SUBTRACT.calculate(10, 5);
        System.out.println(result1);
        System.out.println(result2);
    }
}
