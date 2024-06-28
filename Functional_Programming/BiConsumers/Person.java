package Functional_Programming.BiConsumers;

import java.util.function.BiConsumer;

public class Person
{
    private  String name;
    private  int phoneNumber;

    public Person(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    static void showInfoNormal(Person person,  boolean showInfoBool)
    {
        System.out.println("Hello " + person.getName() + " ,phone number: "
                + (showInfoBool ?  person.getPhoneNumber() : "********"));
    }

    static BiConsumer<Person, Boolean> showInfoBiConsumer = (person, showInfoBool)
            -> System.out.println("Hello " + person.getName() + " ,phone number: "
            + (showInfoBool ?  person.getPhoneNumber() : "********"));
}
