package Functional_Programming.Functional_interface_chaining;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args) {

       // Create a list of integers
List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

// Print the string "Functional interface" to the console
System.out.println("// Functional interface");

// Call the method incrementByOne from the Functions class
// This method takes an integer as input and increments it by 1
// Here, we are passing 0 as the argument
// The result of the operation is printed to the console
System.out.println("Normal function call: " + Functions.incrementByOne(0));

// Use the Function incrementByOneFunction from the Functions class
// This Function does the same operation as the normal method above
// Here, we are applying the Function to the first number in the list
// The result of the operation is printed to the console
System.out.println("Functional interface call: " + Functions.incrementByOneFunction.apply(numbers.get(0)));

// Get the list of results after incrementing each number in the list by 1 and multiplying by 10
// This is done by applying the Function incrementByOneFunction and then the Function multiplyBy10Function to each number in the list
// The results are collected into a new list
List<Integer> result = numbers.stream()
        .map(Functions.incrementByOneFunction
                .andThen(Functions.multiplyBy10Function))
        .collect(Collectors.toList());

// Print each number in the result list to the console
result.forEach(System.out::println);

// Create a Function that increments a number by 1, multiplies the result by 10, and then increments the result by 1
// This is done by chaining the Function incrementByOneFunction, the Function multiplyBy10Function, and the Function incrementByOneFunction
// Here, we are applying the chained Function to the number 4
// The result of the operation is printed to the console
Function<Integer, Integer>  chainedFunction = (Functions.incrementByOneFunction.andThen(Functions.multiplyBy10Function)).andThen(Functions.incrementByOneFunction);
System.out.println(chainedFunction.apply(4));

// Create a Function that increments a number by 1, multiplies the result by 10, increments the result by 1, and then multiplies the result by 10
// This is done by chaining the previously created Function with the Function multiplyBy10Function
// Here, we are applying the chained Function to the number 4
// The result of the operation is printed to the console
Function<Integer, Integer>  chainedFunction2 = chainedFunction.andThen(Functions.multiplyBy10Function);
System.out.println(chainedFunction2.apply(4));
    }
}
