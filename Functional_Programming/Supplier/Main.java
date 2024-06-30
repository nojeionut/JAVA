package Functional_Programming.Supplier;

import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args) {

    // Supplier is a functional interface which takes no argument and returns a result.
    // It is used to supply a value.
    // It is used to generate or supply values without taking any input.

        //Example 1
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        //Example 2
        Supplier<Double> supplier1 = () -> Math.random();
        System.out.println(supplier1.get());

        //Example 3
        Supplier<Integer> supplier2 = () -> 10;
        System.out.println(supplier2.get());

        //Example 4
        Supplier<String> supplier3 = () -> {
            String[] names = {"A", "B", "C", "D"};
            int index = (int) (Math.random() * names.length);
            return names[index];
        };
        System.out.println(supplier3.get());

    }
}
