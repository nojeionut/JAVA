package Functional_Programming.Functional_interface;

public class Main
{
    public static void main(String[] args) {

       // Print the string "Functional interface" to the console
System.out.println("// Functional interface");

// Call the method incrementByOne from the Functions class
// This method takes an integer as input and increments it by 1
// Here, we are passing 0 as the argument
// The result of the operation is printed to the console
System.out.println("Normal function call: " + Functions.incrementByOne(0));

// Use the Function incrementByOneFunction from the Functions class
// This Function does the same operation as the normal method above
// Here, we are applying the Function to the argument 0
// The result of the operation is printed to the console
System.out.println("Functional interface call: " + Functions.incrementByOneFunction.apply(0));

    }
}
