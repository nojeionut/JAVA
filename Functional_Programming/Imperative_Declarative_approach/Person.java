package Functional_Programming.Imperative_Declarative_approach;

public class Person{
    private final String name;
    private final Gender gender;
    
    public Person(String name, Gender gender)
    {
        this.name = name;
        this.gender = gender;
    }

    enum Gender{
        MALE, FEMALE
    }
    
    public Gender getGender()
    {
        return this.gender;
    }

    public String getName()
    {
        return this.name;
    }
    
}
