package OOP_Concepts_remembered;

public abstract class Employee implements Workable
{
    /**
 * The name of the employee.
 */
private String name;

/**
 * The age of the employee.
 */
private int age;

/**
 * The department of the employee.
 */
private String departament;

/**
 * The hourly rate of the employee.
 */
private double hourlyRate;

/**
 * Constructs a new Employee object with the given name, age, department, and hourly rate.
 *
 * @param name The name of the employee.
 * @param age The age of the employee.
 * @param departament The department of the employee.
 * @param hourlyRate The hourly rate of the employee.
 */
public Employee(String name, int age, String departament, double hourlyRate)
{
    this.name = name;
    this.age = age;
    this.departament = departament;
    this.hourlyRate = hourlyRate;
}

/**
 * Returns the name of the employee.
 *
 * @return The name of the employee.
 */
public String getName() {
    return name;
}

/**
 * Sets the name of the employee.
 *
 * @param name The new name of the employee.
 */
public void setName(String name) {
    this.name = name;
}

/**
 * Returns the age of the employee.
 *
 * @return The age of the employee.
 */
public int getAge() {
    return age;
}

/**
 * Sets the age of the employee.
 *
 * @param age The new age of the employee.
 */
public void setAge(int age) {
    this.age = age;
}

/**
 * Returns the department of the employee.
 *
 * @return The department of the employee.
 */
public String getDepartament() {
    return departament;
}

/**
 * Sets the department of the employee.
 *
 * @param departament The new department of the employee.
 */
public void setDepartament(String departament) {
    this.departament = departament;
}

/**
 * Returns the hourly rate of the employee.
 *
 * @return The hourly rate of the employee.
 */
public double getHourlyRate() {
    return hourlyRate;
}

/**
 * Sets the hourly rate of the employee.
 *
 * @param salary The new hourly rate of the employee.
 */
public void setHourlyRate(double salary) {
    this.hourlyRate = salary;
}

/**
 * Abstract method to calculate the salary of the employee.
 * This method must be implemented by any class that extends Employee.
 *
 * @return The salary of the employee.
 */
public abstract int calculateSalary();

/**
 * Method to simulate the employee working.
 * Prints "I am working" to the console.
 */
@Override
public void work()
{
    System.out.println("I am working");
}
}
