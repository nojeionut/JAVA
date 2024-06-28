package Functional_Programming.Functional_interface_chaining;

import java.util.function.Function;

public class Functions
{

    public static int incrementByOne(int number)
    {
        return number + 1;
    }
    public static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    public static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

}
