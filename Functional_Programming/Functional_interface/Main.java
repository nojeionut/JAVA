package Functional_Programming.Functional_interface;

public class Main
{
    public static void main(String[] args) {

        System.out.println("// Functional interface");
        System.out.println("Normal function call: " + Functions.incrementByOne(0));
        System.out.println("Functional interface call: " + Functions.incrementByOneFunction.apply(0));


    }
}
