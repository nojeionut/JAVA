package Functional_Programming.BiConsumers;

import java.util.List;

public class Main
{
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", 123456789),
            new Person("Maria", 987654321),
            new Person("Aisha", 123123123),
            new Person("Alex", 321321321)
        );

        System.out.println("// Imperative approach");
        // Imperative approach
        for (Person person : people) {
            Person.showInfoNormal(person, true);
        }

        System.out.println("// Declarative approach");
        // Declarative approach
        people.forEach(person -> Person.showInfoBiConsumer.accept(person,false));


    }

}

