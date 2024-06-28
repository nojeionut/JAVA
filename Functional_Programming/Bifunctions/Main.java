package Functional_Programming.Bifunctions;

import java.util.*;

public class Main
{
    public static void main(String[] args) {

       // Create a list of integers
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

System.out.println("// Bifunctions");
// Bifunctions

    // Use the normal function add1AndMultiply from the Functions class
    // This function takes two integers, adds 1 to the first integer, and multiplies the result by the second integer
    // Here, we are passing 2 and 10 as arguments
System.out.println(Funtions.add1AndMultiply(2, 10));

    // Use the BiFunction add1AndMultiplyBiFunction from the Functions class
    // This BiFunction does the same operation as the normal function above
    // Here, we are applying the BiFunction to the arguments 2 and 10
System.out.println(Funtions.add1AndMultiplyBiFunction.apply(2, 10));

    // Apply the BiFunction add1AndMultiplyBiFunction to each number in the list
    // The result of each operation is printed to the console
numbers.stream()
    .map(number -> Funtions.add1AndMultiplyBiFunction.apply(number, 10))
    .forEach(System.out::println);

    // Apply the BiFunction add1AndMultiplyBiFunctionOnList to the list of numbers and the integer 10
    // This BiFunction increments each number in the list by 1, multiplies the result by the second integer, and collects the results into a new list
    // The result list is printed to the console
List<Integer> results  = Funtions.add1AndMultiplyBiFunctionOnList.apply(numbers, 10);
results.forEach(System.out::println);

    }
}

