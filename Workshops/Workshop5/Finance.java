package Workshops.Workshop5;
import java.util.Scanner;

public class Finance {
    public static void main(String[] args) {
        int scholarshipPerMonth, savings, tuitionFee, rentPerMonth, extraExpensesPerMonth;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Welcome to the finances program!");
            System.out.println("Enter the amount of scholarship per month:");
                scholarshipPerMonth = input.nextInt();
            System.out.println("Enter the amount of savings:");
                savings = input.nextInt();
            System.out.println("Enter the tuition fee per semester:");
                tuitionFee = input.nextInt();
            System.out.println("Enter the rent per month:");
                rentPerMonth = input.nextInt();
            System.out.println("Enter the monthly extra expenses:");
                extraExpensesPerMonth = input.nextInt();
            
            int totalIncome, totalExpenses;
                totalIncome = (scholarshipPerMonth*12) + savings;
                totalExpenses = (tuitionFee*2) + (rentPerMonth*12) + extraExpensesPerMonth*12;
            
            int financeCalculation = totalIncome - totalExpenses;
                if(financeCalculation > 0){
                    System.out.println("The total income is " + totalIncome + " and the total spending is " + totalExpenses + " Your income is sufficient for your spending. You have " + financeCalculation + " after expenses.");
                } else if( financeCalculation < 0){
                    System.out.println("The total income is " + totalIncome + " and the total spending is " + totalExpenses + " Your income is less than your spending. You have a deficit of " + financeCalculation + ".");
                }   
    }
}
