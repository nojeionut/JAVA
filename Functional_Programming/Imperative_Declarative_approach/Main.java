package Functional_Programming.Imperative_Declarative_approach;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", Person.Gender.MALE),
            new Person("Maria", Person.Gender.FEMALE),
            new Person("Aisha", Person.Gender.FEMALE),
            new Person("Alex", Person.Gender.MALE)
        );

        System.out.println("// Imperative approach");
        // Imperative approach of storing only the females in a separate list

        List<Person> females = new ArrayList<>();

        for(Person person: people)
        {
            if(Person.Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for(Person female: females)
        {
            System.out.println("Name: " +female.getName() + " Gender: " + female.getGender());
        }


        //Declarative approach
        System.out.println("Declarative approach");

        List<Person> females2 = people.stream()
                .filter(person -> Person.Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());

        females2.forEach(person -> System.out.println("Name: " +person.getName() + " Gender: " + person.getGender()));
    }
}
