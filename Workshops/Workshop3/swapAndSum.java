package Workshops.Workshop3;
import java.util.Scanner;

public class swapAndSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the swap and sum program. Please enter 3 integers.");
        int num1, num2, num3;
        double sumValue;
        int temp;
        num1 = input.nextInt(); num2 = input.nextInt(); num3 = input.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;

        sumValue = (num1 + num2 + num3);
        System.out.println("The swap and sum result is: " + sumValue);
    }
    
}
