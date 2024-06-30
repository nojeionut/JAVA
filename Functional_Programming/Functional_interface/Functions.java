package Functional_Programming.Functional_interface;

import java.util.*;
import java.util.function.Function;

/**
 * This class contains methods and functions related to incrementing numbers.
 */
public class Functions
{
    /**
     * A Function that takes an integer as input and increments it by 1.
     *
     * @param number The integer to be incremented.
     * @return The result of number + 1.
     */
    public static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    /**
     * This method takes an integer as input and increments it by 1.
     *
     * @param number The integer to be incremented.
     * @return The result of number + 1.
     */
    public static int incrementByOne(int number)
    {
        return number + 1;
    }

    // Function that takes a list of strings(fruits) as input and return the number of fruits that start with the letter 'A'
    public static Function<List<String>, Long> countFruitsStartingWithA = fruites -> fruites.stream().filter(fruit -> fruit.startsWith("A") || fruit.startsWith("a")).count();
}