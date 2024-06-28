package Functional_Programming.Functional_interface;

import java.util.function.Function;

public class Functions
{

    public static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    public static int incrementByOne(int number)
    {
        return number + 1;
    }


}
