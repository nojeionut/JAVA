package Functional_Programming.Bifunctions;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Funtions
{

    /**
 * This method takes two integers as input, adds 1 to the first integer,
 * and then multiplies the result by the second integer.
 *
 * @param number The first integer input.
 * @param numberToMultiplyBy The second integer input.
 * @return The result of (number + 1) * numberToMultiplyBy.
 */
public static int add1AndMultiply(int number, int numberToMultiplyBy)
{
    return (number + 1) * numberToMultiplyBy;
}

    /**
 * A BiFunction that takes two integers as input, adds 1 to the first integer,
 * and then multiplies the result by the second integer.
 *
 * @param number The first integer input.
 * @param numberToMultiplyBy The second integer input.
 * @return The result of (number + 1) * numberToMultiplyBy.
 */
public static BiFunction<Integer, Integer, Integer> add1AndMultiplyBiFunction =
    (number, numberToMultiplyBy) -> (number + 1) * numberToMultiplyBy;

/**
 * A BiFunction that takes a list of integers and another integer as input.
 * It increments each integer in the list by 1, multiplies the result by the second integer,
 * and collects the results into a new list.
 *
 * @param list The list of integers to be processed.
 * @param numberToMultiplyBy The integer by which the incremented numbers are multiplied.
 * @return A new list containing the result of each operation.
 */
public static BiFunction<List<Integer>, Integer, List<Integer>> add1AndMultiplyBiFunctionOnList =
    (list, numberToMultiplyBy) -> list.stream()
        .map(number -> (number + 1) * numberToMultiplyBy)
        .collect(Collectors.toList());
}
