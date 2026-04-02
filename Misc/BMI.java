package Misc;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
            double weight, height; 
         System.out.print("Enter weight in pounds: ");
                weight = input.nextDouble() * 0.45359237; 
        System.out.print("Enter height in inches: ");
            height = input.nextDouble() * 0.0254; 
        System.out.println("BMI is " + weight / Math.pow(height, 2));
    }
}

