package Workshops.Workshop8;
import java.util.Scanner;

public class productRange {
    public static void main(String[] args){
        int start, end, product = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the odd range calculator. Enter a starting and ending point for the range.");
        System.out.print("Enter start: ");
        start = input.nextInt();
        System.out.print("Enter end: ");
        end = input.nextInt();

        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                product *= i;
            }
        }
        System.out.println("The product of the odd numbers in the range from " + start + " to " + end + " is: " + product);
    }
}
