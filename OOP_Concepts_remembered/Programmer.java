package OOP_Concepts_remembered;

public class Programmer extends Employee
{
    private String language;

    public Programmer(String name, int age, String departament, double salary, String language)
    {
        super(name, age, departament, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    //get the annual salary
    @Override
    public int calculateSalary()
    {
        return (int) (50 * 8 * getHourlyRate() * 30);
    }

    @Override
    public void work()
    {
        System.out.println("I am a programmer and I am working on a project");
    }
}
