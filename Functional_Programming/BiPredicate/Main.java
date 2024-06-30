package Functional_Programming.BiPredicate;

import java.util.Objects;
import java.util.function.BiPredicate;

public class Main
{
    public static void main(String[] args) {

        // BiPredicate is a functional interface that takes two arguments and returns a boolean
        // syntax: boolean test(T t, U u) where T and U are the types of the arguments to the function

        // Example 1
        // BiPredicate to check if two integers are equal
        System.out.println(checkEquality.test(5, 5)); // true

    }

    static BiPredicate<Integer, Integer> checkEquality = (a, b) -> Objects.equals(a, b);
}
