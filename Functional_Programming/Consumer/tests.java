package Functional_Programming.Consumer;

import java.util.*;
import java.util.function.Consumer;

public class tests
{
    public static void main(String[] args) {

        List<String> names = List.of("John", "Maria", "Aisha", "Alex");
        showNumber.accept(21);

        printNames.accept(names);

    }
    // Consumer Functional Interface with and then
    static Consumer<Integer> showNumber  = number -> System.out.println("the number is: " + number);

    // Consumer Functional Interface print names in the list and write hello before each name
    static Consumer<List<String>> printNames = names -> {
        names.forEach(name -> System.out.println("Hello " + name));
    };
    }
