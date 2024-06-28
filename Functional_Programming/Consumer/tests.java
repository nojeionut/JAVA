package Functional_Programming.Consumer;

import java.util.*;
import java.util.function.Consumer;

public class tests
{
    /**
 * This is the main method which serves as the entry point for the program.
 *
 * @param args Unused.
 */
public static void main(String[] args) {

    // Create a list of names
    List<String> names = List.of("John", "Maria", "Aisha", "Alex");

    // Use the showNumber Consumer to print a number
    showNumber.accept(21);

    // Use the printNames Consumer to print each name in the list
    printNames.accept(names);

}

/**
 * This is a Consumer functional interface that takes an Integer as input.
 * It prints out the number with a preceding message.
 */
static Consumer<Integer> showNumber  = number -> System.out.println("the number is: " + number);

/**
 * This is a Consumer functional interface that takes a List of Strings as input.
 * It iterates over the list and prints out each name with a preceding greeting.
 */
static Consumer<List<String>> printNames = names -> {
    names.forEach(name -> System.out.println("Hello " + name));
};
    }
