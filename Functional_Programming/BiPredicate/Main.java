package Functional_Programming.BiPredicate;

import java.util.Objects;
import java.util.function.BiPredicate;

public class Main
{
    public static void main(String[] args) {

        // BiPredicate is a functional interface that takes two arguments and returns a boolean
        // syntax: boolean test(T t, U u) where T and U are the types of the arguments to the function

        String phoneNumber = "0773946567";
        int length = 10;


        // Example 1
        // BiPredicate to check if two integers are equal
        System.out.println("Check if two integers are equal");
        System.out.println(checkEquality.test(5, 5));


        System.out.println("The phone number is: " + phoneNumber);


        // Example 2
        // BiPredicate to check if the length of a phone number is equal to 10
        System.out.println("Check if the length of a phone number is equal to 10");
        System.out.println(checkPhoneNumberLength.test(phoneNumber, length));

        // Example 3
        // BiPredicate to check if the phone number contains a specific number
        System.out.println("Check if the phone number contains a specific number");
        System.out.println(checkPhoneNumberContainsCharacter.test(phoneNumber, "8"));

        //Example 4
        // BiPredicate to check if the phone number contains a specific sequence of numbers
        System.out.println("Check if the phone number contains a specific sequence of numbers");
        System.out.println(checkPhoneNumberContainsSequence.test(phoneNumber, "394"));
    }

    static BiPredicate<Integer, Integer> checkEquality = (a, b) -> Objects.equals(a, b);

    static BiPredicate<String,Integer> checkPhoneNumberLength = (phoneNumber, length) -> phoneNumber.length() == length;

    static BiPredicate<String,String> checkPhoneNumberContainsCharacter = (phoneNumber, character) -> phoneNumber.contains(character);

    static BiPredicate<String,String> checkPhoneNumberContainsSequence = (phoneNumber, sequence) -> phoneNumber.contains(sequence);

}
