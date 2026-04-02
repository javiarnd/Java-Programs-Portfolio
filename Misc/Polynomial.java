package Misc;
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        System.out.println("Welcome to the polynomial calculator!");
        System.out.println("This is the polynomial we will be evaluating: f(x) = 2.1x^3 + 3.7x^2 - 3");
        System.out.println("Please enter a value for x!");
        Scanner input = new Scanner(System.in);
        float xValue = input.nextFloat();
        double evaluatedPolynomial = 2.1*(Math.pow(xValue, 3)) + 3.7*(Math.pow(xValue, 2)) - 3;
        System.out.println("The answer given the x value of " + xValue + " is " + evaluatedPolynomial + "!");
    
    }
}
