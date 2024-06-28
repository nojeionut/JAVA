package Functional_Programming.BiConsumers;
import java.util.*;
import java.util.function.BiConsumer;

public class tests {
    public static void main(String[] args) {

        List<String> firstNames = List.of("John", "Maria", "Aisha", "Alex");
        List<String> lastNames = List.of("Stevens", "Johnson", "Sheikh", "Jones");

        BiConsumer<String, String> printFullName = (firstName, lastName) -> System.out.println(firstName + " " + lastName);

        for (int i = 0; i < firstNames.size(); i++) {
            printFullName.accept(firstNames.get(i), lastNames.get(i));
        }
    }
}