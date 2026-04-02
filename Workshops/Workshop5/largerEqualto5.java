package Workshops.Workshop5;
import java.util.Scanner;

public class largerEqualto5 {
    public static void main(String[] args) {
        int greaterThan5 = 0;
    System.out.println("Enter a four digit number.");
    Scanner input = new Scanner(System.in);
    int fourDigitnum = input.nextInt();

        while(fourDigitnum > 0){
            int num = fourDigitnum % 10;
                if(num >= 5){
                    greaterThan5++;
                }
                    fourDigitnum = fourDigitnum / 10;
            }
                System.out.println(greaterThan5);

         }

    }

