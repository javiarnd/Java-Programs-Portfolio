package Workshops.Workshop6;
import java.util.Scanner;

public class Payroll {
    public static void main(String [] args){
        String employeeName;
        double hoursWorked, payRate, federalTaxRate, stateTaxRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Payroll Program! Please enter the following data: ");
        System.out.print("Enter your name: ");
        employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.print("Enter federal tax rate: ");
        federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax rate: ");
        stateTaxRate = input.nextDouble();

        double federalTax, stateTax, netPay, grossPay, totalDeductions; 
        grossPay = hoursWorked * payRate;
        federalTax = grossPay * federalTaxRate;
        stateTax = grossPay * stateTaxRate;
        totalDeductions = federalTax + stateTax;
        netPay = grossPay - totalDeductions;

        System.out.printf("Employee name: %s%n" +
                "Hours worked: %.2f%n" +
                "Pay rate: $%.2f%n" +
                "Gross pay: $%.2f%n" +
                "Deductions: %n" +
                "\tFederal tax (%.1f%%): $%.2f%n" +
                "\tState tax (%.1f%%): $%.2f%n" +
                "\tTotal deductions: $%.2f%n" +
                "Net pay: $%.2f", 
                employeeName, hoursWorked, payRate, grossPay, 
                (federalTaxRate * 100), federalTax, 
                (stateTaxRate * 100), stateTax, 
                totalDeductions, netPay);
    }
}
