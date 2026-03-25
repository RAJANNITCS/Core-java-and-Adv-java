// WAP to demostrating Custome TriPredicate

@FunctionalInterface
interface TriPredicate<T, U, V> {

    // abstract method with 3 input
    boolean test(T t, U u, V v);

}

public class TriPredicateExample {
    public static void main(String[] args) {

        //Lambda expression with 3 inputs
        TriPredicate<Integer, Integer, Integer> isSumGrate = (num1, num2, num3) -> (num1 + num2) > num3;

        // calling method 
        System.out.println("Is first two number sum then grater then thired number = " + isSumGrate.test(5, 4, 10));
        System.out.println("Is first two number sum then grater then thired number = " + isSumGrate.test(5, 4, 8));
    }
}
