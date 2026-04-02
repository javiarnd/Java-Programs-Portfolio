package Misc;
import java.util.Scanner;

public class examQuestion {
public static void main(String[] args) {
    int num1, num2, num3, num4;
    System.out.println("Welcome to Even vs Odd! Please input 4 numbers.");
    Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        int sumOfEvens = 0;
        int sumOfOdss = 0;
    
    if(num1 % 2 == 0){
        sumOfEvens += num1;
    }else{
        sumOfOdss += num1;
    }
     if(num2 % 2 == 0){
        sumOfEvens += num2;
    }else{
        sumOfOdss += num2;
    }
     if(num3 % 2 == 0){
        sumOfEvens += num3;
    }else{
        sumOfOdss += num3;
    }
     if(num4 % 2 == 0){
        sumOfEvens += num4;
    }else{
        sumOfOdss += num4;
    }

    if(sumOfEvens > sumOfOdss){
        System.out.println("Evens won!");
    } else if(sumOfOdss > sumOfEvens){
        System.out.println("Odds won!");
    } else {
         System.out.println("Tie");
    }

    }
}
