package OOP_Concepts_remembered;

public class HumanResourceEmployee extends Employee
{
    /**
 * The role of the HumanResourceEmployee.
 */
private String role;

/**
 * Constructs a new HumanResourceEmployee object with the given name, age, department, salary, and role.
 *
 * @param name The name of the HumanResourceEmployee.
 * @param age The age of the HumanResourceEmployee.
 * @param departament The department of the HumanResourceEmployee.
 * @param salary The salary of the HumanResourceEmployee.
 * @param role The role of the HumanResourceEmployee.
 */
public HumanResourceEmployee(String name, int age, String departament, double salary, String role)
{
    super(name, age, departament, salary);
    this.role = role;
}

/**
 * Returns the role of the HumanResourceEmployee.
 *
 * @return The role of the HumanResourceEmployee.
 */
public String getRole() {
    return role;
}

/**
 * Sets the role of the HumanResourceEmployee.
 *
 * @param role The new role of the HumanResourceEmployee.
 */
public void setRole(String role) {
    this.role = role;
}

/**
 * Calculates the annual salary of the HumanResourceEmployee.
 * The calculation is based on the assumption of 20.8 working days per month, 8 hours per day, and 30 days per month.
 *
 * @return The annual salary of the HumanResourceEmployee.
 */
@Override
public int calculateSalary()
{
    return (int) (20.8 * 8 * getHourlyRate() * 30);
}

/**
 * Simulates the HumanResourceEmployee working.
 * Prints "I am a human resource employee and I am working on hiring new employees" to the console.
 */
@Override
public void work()
{
    System.out.println("I am a human resource employee and I am working on hiring new employees");
}
}
