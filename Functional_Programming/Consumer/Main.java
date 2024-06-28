package Functional_Programming.Consumer;

import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args) {

        Customer customer1 = new Customer("John", "123456");
        Customer.greetCustomer(customer1);

        Customer customer2 = new Customer("Maria", "654321");
        Customer.greetCustomerConsumer.accept(customer2);
    }

}
