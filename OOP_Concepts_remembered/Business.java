package OOP_Concepts_remembered;

import java.util.*;

public class Business {
    // Singleton instance of the Business class
private static Business business_instance = null;

// List of employees in the business
private List<Employee> employees;

/**
 * Private constructor for the Business class.
 * Initializes the employees list.
 */
private Business() {
    employees = new ArrayList<>();
}

/**
 * Static method to get the singleton instance of the Business class.
 * If the instance does not exist, it is created and a message is printed to the console.
 *
 * @return The singleton instance of the Business class.
 */
public static Business getBusiness_instance() {
    if (business_instance == null) {
        business_instance = new Business();
        System.out.println("OOP_Concepts_remembered.Business instance created");
    }

    return business_instance;
}

/**
 * Method to add an employee to the business.
 *
 * @param employee The employee to be added.
 */
public void addEmployee(Employee employee) {
    employees.add(employee);
}

/**
 * Method to get the list of employees in the business.
 *
 * @return The list of employees.
 */
public List<Employee> getEmployees() {
    return employees;
}

}
