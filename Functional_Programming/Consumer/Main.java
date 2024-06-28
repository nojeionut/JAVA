package Functional_Programming.Consumer;

import java.util.function.Consumer;

public class Main
{
    /**
 * This is the main method which serves as the entry point for the program.
 *
 * @param args Unused.
 */
public static void main(String[] args) {

    // Create a new Customer object named customer1 with the name "John" and phone number "123456"
    Customer customer1 = new Customer("John", "123456");

    // Call the greetCustomer method of the Customer class with customer1 as the argument
    Customer.greetCustomer(customer1);

    // Create a new Customer object named customer2 with the name "Maria" and phone number "654321"
    Customer customer2 = new Customer("Maria", "654321");

    // Call the accept method of the greetCustomerConsumer Consumer of the Customer class with customer2 as the argument
    Customer.greetCustomerConsumer.accept(customer2);
}
}
