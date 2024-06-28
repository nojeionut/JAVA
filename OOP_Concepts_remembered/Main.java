package OOP_Concepts_remembered;

public class Main{
    public static void main(String[] args){
// Get the singleton instance of the Business class
Business business = Business.getBusiness_instance();

// Add a new Programmer employee named John, aged 30, from the IT department, with an hourly rate of 30, and proficient in Java
business.addEmployee(new Programmer("John", 30, "IT", 30, "Java"));

// Add a new HumanResourceEmployee named Alice, aged 25, from the HR department, with an hourly rate of 25, and with the role of Recruiter
business.addEmployee(new HumanResourceEmployee("Alice", 25, "HR", 25, "Recruiter"));

// Add a new Programmer employee named Bob, aged 35, from the IT department, with an hourly rate of 35, and proficient in Python
business.addEmployee(new Programmer("Bob", 35, "IT", 35, "Python"));

// Iterate over each employee in the business
for(Employee employee : business.getEmployees()){
    // Print the name and calculated salary of the employee to the console
    System.out.println(employee.getName() + " " + employee.calculateSalary());

    // Simulate the employee working
    employee.work();
}
    }
}