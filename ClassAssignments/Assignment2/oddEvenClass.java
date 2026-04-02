package ClassAssignments.Assignment2;
import java.util.Scanner;
public class oddEvenClass {
    public static void main(String[] args){
    int num1, num2, num3, num4, num5;
    System.out.println("Welcome to Even vs Odd! Please input 5 numbers.");
    Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        int sumOfEvens = 0;
        int sumOfOdds = 0;
        int numOddNumbers = 0;

        if (num1 % 2 == 0) {
            sumOfEvens += num1;
        } else {
            sumOfOdds += num1;
            numOddNumbers++;
        }
          if (num2 % 2 == 0) {
            sumOfEvens += num2;
        } else {
            sumOfOdds += num2;
            numOddNumbers++;
        }
          if (num3 % 2 == 0) {
            sumOfEvens += num3;
        } else {
            sumOfOdds += num3;
            numOddNumbers++;
        }
          if (num4 % 2 == 0) {
            sumOfEvens += num4;
        } else {
            sumOfOdds += num4;
            numOddNumbers++;
        }
          if (num5 % 2 == 0) {
            sumOfEvens += num5;
        } else {
            sumOfOdds += num5;
            numOddNumbers++;
        }

        System.out.println("The sum of the even numbers is " + sumOfEvens);
        System.out.println("The sum of the odd numbers is " + sumOfOdds);
        System.out.println("The difference between evens and odds is " + (sumOfEvens-sumOfOdds));
        System.out.println("The average of the odd numbers is " + ((double) sumOfOdds / numOddNumbers));
















    }
}
