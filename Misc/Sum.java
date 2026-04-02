package Misc;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Welcome to the Finite Sum calculator!");
        System.out.println("Please enter a value for n (end value of the sum).");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int finiteSum = (n*(n+1))/2;

        System.out.println("The sum from 1 to " + n + " is equal to: " + finiteSum + "!");
    }
}
