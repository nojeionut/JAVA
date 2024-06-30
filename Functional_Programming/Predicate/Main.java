package Functional_Programming.Predicate;

import java.util.List;
import java.util.function.*;

public class Main
{
    public static void main(String[] args) {
        // Predicate is a functional interface that takes one argument and returns a boolean value.
        // It is used to test a condition.
        // It has a single method test() that returns a boolean value.
        // It is used to filter data.
        // It is used to test conditions.
        // It is used to check null values.

        // Predicate interface
        // Predicate<T> p = (T t) -> { return true/false; };

        List<String> fruites = List.of("Apple", "Banana", "Orange", "Grapes", "Pineapple", "Mango", "Watermelon", "Strawberry");

        String phonenumber = "0223946569";

        System.out.println("Phone Number: " + phonenumber);

        System.out.println("Normal Method");
        System.out.println(checkPhoneNumber(phonenumber));

        System.out.println("Predicate Method");
        System.out.println(checkPhoneNumberPredicate.test(phonenumber));

        // Predicate interface with and() method
        System.out.println("Predicate with and() method to check for 2");
        System.out.println(checkPhoneNumberPredicate.and(checkForNumber2).test(phonenumber));

        // Predicate interface with or() method
        System.out.println("Predicate with or() method to check for 2");
        System.out.println(checkPhoneNumberPredicate.or(checkForNumber2).test(phonenumber));

        // Predicate with and() and or() method
        System.out.println("Predicate with and() and or() method to check if number 5 is repeated 3 times + and() + or()");
        System.out.println(checkPhoneNumberPredicate.or(checkForNumber2).and(countNumber5).test(phonenumber));
        // this predicate tests if the phone number starts with 07, contains 2 and has 3 5's in it.


        System.out.println("Predicate with allMatch() method to check if all fruites start with A");
        System.out.println(checkFruitInitial.test(fruites));

    }

    static boolean checkPhoneNumber(String phonenumber)
    {
        return phonenumber.length() == 10 && phonenumber.startsWith("07");
    }

    static Predicate<String> checkPhoneNumberPredicate = phonenumber
            -> phonenumber.length() == 10 && phonenumber.startsWith("07");

    static Predicate<String> checkForNumber2 = phonenumber -> phonenumber.contains("2");

    static Predicate<String> countNumber5 = phonenumber -> phonenumber.chars().filter(ch -> ch == '5').count() == 3;

    static Predicate<List<String>> checkFruitInitial = fruites
            -> fruites.stream().anyMatch(fruite
            -> fruite.startsWith("A"));
}
