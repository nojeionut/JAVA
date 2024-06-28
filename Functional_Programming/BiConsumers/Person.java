package Functional_Programming.BiConsumers;

import java.util.function.BiConsumer;

public class Person
{
    /**
 * The name of the person.
 */
private  String name;

/**
 * The phone number of the person.
 */
private  int phoneNumber;

/**
 * Constructs a new Person with the given name and phone number.
 *
 * @param name The name of the person.
 * @param phoneNumber The phone number of the person.
 */
public Person(String name, int phoneNumber)
{
    this.name = name;
    this.phoneNumber = phoneNumber;
}

/**
 * Returns the name of the person.
 *
 * @return The name of the person.
 */
public String getName()
{
    return name;
}

/**
 * Returns the phone number of the person.
 *
 * @return The phone number of the person.
 */
public int getPhoneNumber()
{
    return phoneNumber;
}

/**
 * Prints the information of the person. If showInfoBool is true, it prints the phone number,
 * otherwise it prints asterisks instead of the phone number.
 *
 * @param person The person whose information is to be printed.
 * @param showInfoBool A boolean value that determines whether to print the phone number or not.
 */
static void showInfoNormal(Person person,  boolean showInfoBool)
{
    System.out.println("Hello " + person.getName() + " ,phone number: "
            + (showInfoBool ?  person.getPhoneNumber() : "********"));
}

/**
 * A BiConsumer functional interface that prints the information of the person. If showInfoBool is true, it prints the phone number,
 * otherwise it prints asterisks instead of the phone number.
 */
static BiConsumer<Person, Boolean> showInfoBiConsumer = (person, showInfoBool)
        -> System.out.println("Hello " + person.getName() + " ,phone number: "
        + (showInfoBool ?  person.getPhoneNumber() : "********"));
}
