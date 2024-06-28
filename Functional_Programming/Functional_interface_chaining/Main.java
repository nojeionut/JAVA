package Functional_Programming.Functional_interface_chaining;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

        System.out.println("// Functional interface");
        System.out.println("Normal function call: " + Functions.incrementByOne(0));
        System.out.println("Functional interface call: " + Functions.incrementByOneFunction.apply(numbers.get(0)));


        //  get the list of results after incrementing by 1 and multiplying by 10
        List<Integer> result = numbers.stream()
                .map(Functions.incrementByOneFunction
                        .andThen(Functions.multiplyBy10Function))
                .collect(Collectors.toList());

        result.forEach(System.out::println);


        // create a function that increment by 1 and multiply by 10 by chaining and then increment by 1, chaining 3 functions
        Function<Integer, Integer>  chainedFunction = (Functions.incrementByOneFunction.andThen(Functions.multiplyBy10Function)).andThen(Functions.incrementByOneFunction);
        System.out.println(chainedFunction.apply(4));
        // create a funtion that increment by 1 and multiply by 10 by chaining

        // create a separate function that increment by 1 and multiply by 10 by chaining
        Function<Integer, Integer>  chainedFunction2 = chainedFunction.andThen(Functions.multiplyBy10Function);
        System.out.println(chainedFunction2.apply(4));
    }
}
