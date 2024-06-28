package OOP_Concepts_remembered;

public abstract class Employee implements Workable
{
    private String name;
    private int age;
    private String departament;
    private double hourlyRate;


    public Employee(String name, int age, String departament, double hourlyRate)
    {
        this.name = name;
        this.age = age;
        this.departament = departament;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double salary) {
        this.hourlyRate = salary;
    }

    public abstract int calculateSalary();

    @Override
    public void work()
    {
        System.out.println("I am working");
    }
}
