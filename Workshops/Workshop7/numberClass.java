package Workshops.Workshop7;
import java.util.Scanner;

public class numberClass {
    public static void main(String[] args){
        int a, b, c, d;
        System.out.println("Welcome the numbers class! Please input 4 numbers.");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        int sumOfEvens = 0;
        int sumOfOdds = 0;
        int numOddNumbers = 0;
        int maxOdd = 0;
        int minPosEven = Integer.MAX_VALUE;
        int numEvenNumbers = 0;
        boolean ascendingOrder;

        if (a % 2 == 0) {
            sumOfEvens += Math.abs(a);
            numEvenNumbers++;
            if(a > 0){
                minPosEven = a;
            }
        } else {
            sumOfOdds += Math.abs(a);
            numOddNumbers++;
            maxOdd = a;
        }
          if (b % 2 == 0) {
            sumOfEvens += Math.abs(b);
            numEvenNumbers++;
            if(b > 0 && b < minPosEven){
                minPosEven = b;
            }
        } else {
            sumOfOdds += Math.abs(b);
            numOddNumbers++;
            if(b > maxOdd){
                maxOdd = b;
            }
        }
          if (c % 2 == 0) {
            sumOfEvens += Math.abs(c);
            numEvenNumbers++;
            if(c > 0 && c < minPosEven){
                minPosEven = c;
            }
        } else {
            sumOfOdds += Math.abs(c);
            numOddNumbers++;
            if(c > maxOdd){
                maxOdd = c;
            }
        }
          if (d % 2 == 0) {
            sumOfEvens += Math.abs(d);
            numEvenNumbers++;
            if(d > 0 && d < minPosEven){
                minPosEven = d;
            }
        } else {
            sumOfOdds += Math.abs(d);
            numOddNumbers++;
            if(d > maxOdd){
                maxOdd = d;
            }
        }

        if((a < b) && (b < c) && (c< d)){
            ascendingOrder = true;
        } else {
            ascendingOrder = false;
        }

        double avgValue = (a + b + c + d)/4;
        double a2, b2, c2, d2;
        a2 = a - avgValue; b2 = b - avgValue; c2 = c - avgValue; d2 = d - avgValue;
        double avgPower = (a2*a2 + b2*b2 + c2*c2 + d2*d2) / 4.0;

        System.out.println("The amount of odd numbers is " + numOddNumbers);
        System.out.println("The sum of the odd numbers is " + sumOfOdds);
        System.out.println("The sum of the even numbers is " + sumOfEvens);
        System.out.println("The average of the odd numbers is " + ((double) sumOfOdds / numOddNumbers));
        System.out.println("The biggest odd value entered is " + maxOdd);
        if(minPosEven == Integer.MAX_VALUE){
        System.out.println("No smallest even POSITIVE value was entered");
        } else {
        System.out.println("The smallest even POSITIVE value entered is " + minPosEven);
        }
        System.out.println("The amount of even numbers is " + numEvenNumbers);
        System.out.println("The numbers are in ascending order: " + ascendingOrder);
        System.out.println("The average of the list is " + avgValue);
        System.out.println("The average power of the list is " + avgPower);
    }
}
