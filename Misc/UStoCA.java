package Misc;
import java.util.Scanner;
public class UStoCA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double usDollars, caDollars;
        final double US_CA_RATE = 1.32;

        System.out.println("Welcome to the currency conveter! Choose option: 1. US to CA 2. CA to US (1/2)");
            int choice = input.nextInt();
            switch(choice){
                case 1: 
                System.out.println("Enter $USD amount you would like to covert.");
                usDollars = input.nextDouble();
                    double covertedAmount = usDollars*US_CA_RATE;
                        System.out.println(usDollars + "USD is equal to " + covertedAmount + "CA.");
                break;
                case 2:        
                System.out.println("Enter $CA amount you would like to covert.");
                caDollars = input.nextDouble();
                    covertedAmount = caDollars*(1/US_CA_RATE);
                        System.out.println(caDollars + "CA is equal to " + covertedAmount + "USD.");
                break;
                default:
                System.out.println("Enter $USD amount you would like to covert.");
                usDollars = input.nextDouble();
                    covertedAmount = usDollars*US_CA_RATE;
                        System.out.println(usDollars + "USD is equal to " + covertedAmount + "CA.");
         }
     }
}
