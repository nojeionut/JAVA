package Functional_Programming.Consumer;

import java.util.function.Consumer;

public class Customer
{
    private final String name;
    private final String phoneNumber;

    public Customer(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    static void greetCustomer(Customer customer)
    {
        System.out.println("Hello " + customer.getName() + " thanks for registering phone number " + customer.getPhoneNumber());
    }

    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getName() + " thanks for registering phone number "
                    + customer.getPhoneNumber());

}
