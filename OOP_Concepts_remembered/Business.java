package OOP_Concepts_remembered;

import java.util.*;

public class Business {
    private static Business business_instance = null;
    private List<Employee> employees;

    private Business() {
        employees = new ArrayList<>();
    }

    public static Business getBusiness_instance() {
        if (business_instance == null) {
            business_instance = new Business();
            System.out.println("OOP_Concepts_remembered.Business instance created");
        }

        return business_instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
