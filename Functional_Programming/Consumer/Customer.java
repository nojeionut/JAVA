package Functional_Programming.Consumer;

import java.util.function.Consumer;

/**
 * The Customer class represents a customer with a name and a phone number.
 */
public class Customer
{
    /**
     * The name of the customer.
     */
    private final String name;

    /**
     * The phone number of the customer.
     */
    private final String phoneNumber;

    /**
     * Constructs a new Customer with the given name and phone number.
     *
     * @param name The name of the customer.
     * @param phoneNumber The phone number of the customer.
     */
    public Customer(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the phone number of the customer.
     *
     * @return The phone number of the customer.
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return A string representation of the customer.
     */
    @Override
    public String toString()
    {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    /**
     * Prints a greeting to the customer.
     *
     * @param customer The customer to greet.
     */
    static void greetCustomer(Customer customer)
    {
        System.out.println("Hello " + customer.getName() + " thanks for registering phone number " + customer.getPhoneNumber());
    }

    /**
     * A Consumer functional interface that greets the customer.
     */
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getName() + " thanks for registering phone number "
                    + customer.getPhoneNumber());
}
