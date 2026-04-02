package ClassAssignments.Assignment2;
import java.util.Scanner;

public class MinMaxClass {
    public static void main(String[] args){
    System.out.println("Welcome to MIN & MAX! Please input 3 numbers.");
    Scanner input = new Scanner(System.in);
    double dNum1, dNum2, dNum3, minValue = 0, maxValue = 0;

    dNum1 = input.nextDouble();
    dNum2 = input.nextDouble();
    dNum3 = input.nextDouble();

    if(dNum1 > dNum2){
        minValue = dNum2;
        maxValue = dNum1;
    }
    else if(dNum1 < dNum2){
        minValue = dNum1;
        maxValue = dNum2;
    }

    if(minValue > dNum3){
        minValue = dNum3;
    }

    if(maxValue < dNum3){
        maxValue = dNum3;
    }

    System.out.println("The minimum value of the three numbers is " + minValue);
    System.out.println("The maximum value of the three numbers is " + maxValue);

    }
}
