package OOP_Concepts_remembered;

public class Programmer extends Employee
{
   /**
 * The programming language that the Programmer is proficient in.
 */
private String language;

/**
 * Constructs a new Programmer object with the given name, age, department, salary, and programming language.
 *
 * @param name The name of the Programmer.
 * @param age The age of the Programmer.
 * @param departament The department of the Programmer.
 * @param salary The salary of the Programmer.
 * @param language The programming language that the Programmer is proficient in.
 */
public Programmer(String name, int age, String departament, double salary, String language)
{
    super(name, age, departament, salary);
    this.language = language;
}

/**
 * Returns the programming language that the Programmer is proficient in.
 *
 * @return The programming language that the Programmer is proficient in.
 */
public String getLanguage() {
    return language;
}

/**
 * Sets the programming language that the Programmer is proficient in.
 *
 * @param language The new programming language that the Programmer is proficient in.
 */
public void setLanguage(String language) {
    this.language = language;
}

/**
 * Calculates the annual salary of the Programmer.
 * The calculation is based on the assumption of 50 working days per month, 8 hours per day, and 30 days per month.
 *
 * @return The annual salary of the Programmer.
 */
@Override
public int calculateSalary()
{
    return (int) (50 * 8 * getHourlyRate() * 30);
}

/**
 * Simulates the Programmer working.
 * Prints "I am a programmer and I am working on a project" to the console.
 */
@Override
public void work()
{
    System.out.println("I am a programmer and I am working on a project");
}
}
