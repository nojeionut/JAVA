package Functional_Programming.Imperative_Declarative_approach;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args) {

        // Create a list of Person objects
List<Person> people = List.of(
        new Person("John", Person.Gender.MALE),
        new Person("Maria", Person.Gender.FEMALE),
        new Person("Aisha", Person.Gender.FEMALE),
        new Person("Alex", Person.Gender.MALE)
    );

// Print the string "Imperative approach" to the console
System.out.println("// Imperative approach");

// Imperative approach of storing only the females in a separate list
// Create an empty list of Person objects to store the females
List<Person> females = new ArrayList<>();

// Iterate over each person in the people list
for(Person person: people)
{
    // If the gender of the person is FEMALE, add the person to the females list
    if(Person.Gender.FEMALE.equals(person.getGender())){
        females.add(person);
    }
}

// Iterate over each female in the females list
for(Person female: females)
{
    // Print the name and gender of the female to the console
    System.out.println("Name: " +female.getName() + " Gender: " + female.getGender());
}

// Print the string "Declarative approach" to the console
System.out.println("Declarative approach");

// Declarative approach of storing only the females in a separate list
// Use a stream to filter the people list for females and collect the results into a new list
List<Person> females2 = people.stream()
        .filter(person -> Person.Gender.FEMALE.equals(person.getGender()))
        .collect(Collectors.toList());

// Use a forEach loop to print the name and gender of each female in the females2 list to the console
females2.forEach(person -> System.out.println("Name: " +person.getName() + " Gender: " + person.getGender()));
    }
}
