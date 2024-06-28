package OOP_Concepts_remembered;

public class HumanResourceEmployee extends Employee
{
    private String role;

    public HumanResourceEmployee(String name, int age, String departament, double salary, String role)
    {
        super(name, age, departament, salary);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //get the annual salary
    @Override
    public int calculateSalary()
    {
        return (int) (20.8 * 8 * getHourlyRate() * 30);
    }

    @Override
    public void work()
    {
        System.out.println("I am a human resource employee and I am working on hiring new employees");
    }
}
