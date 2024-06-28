package OOP_Concepts_remembered;

public class Main{
    public static void main(String[] args){

        Business business = Business.getBusiness_instance();

        business.addEmployee(new Programmer("John", 30, "IT", 30, "Java"));
        business.addEmployee(new HumanResourceEmployee("Alice", 25, "HR", 25, "Recruiter"));
        business.addEmployee(new Programmer("Bob", 35, "IT", 35, "Python"));

        for(Employee employee : business.getEmployees()){
            System.out.println(employee.getName() + " " + employee.calculateSalary());
            employee.work();
        }
    }
}