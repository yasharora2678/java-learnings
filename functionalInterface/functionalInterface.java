package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculator {
    int add(int a, int b); // abstract method

    default int multiply(int a, int b) { // default method
        return a * b;
    }
}

public class functionalInterface {
    public static void main(String[] args) {

        Calculator calc = (a, b) -> {
            return a + b;
        };
        calc.add(5, 6);

          // 1. Consumer<T>: takes input, returns nothing
        Consumer<String> printConsumer = s -> System.out.println("Consumer says: " + s);
        printConsumer.accept("Hello, World!");

        // 2. Supplier<T>: takes nothing, returns value
        Supplier<String> stringSupplier = () -> "Message from Supplier!";
        String resultFromSupplier = stringSupplier.get();
        System.out.println(resultFromSupplier);

        // 3. Function<T, R>: takes input and returns output
        Function<Integer, String> intToStringFunction = num -> "Formatted Number: " + num;
        String functionResult = intToStringFunction.apply(10);
        System.out.println(functionResult);

        // 4. Predicate<T>: takes input, returns boolean
        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEvenPredicate.test(10));
        System.out.println("Is 7 even? " + isEvenPredicate.test(7));
    }
}
