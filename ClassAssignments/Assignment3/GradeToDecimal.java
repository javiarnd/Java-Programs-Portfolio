package ClassAssignments.Assignment3;
import java.util.Scanner;

public class GradeToDecimal {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grade to Decimal Program. Please enter a letter grade. (A+ to F)");
        Scanner input = new Scanner(System.in);
        String userGrade = input.next();

        double numGrade = 'F' - (int) Character.toUpperCase(userGrade.charAt(0));
       
        if(userGrade.length() > 1 && userGrade.charAt(1) == '+'){
            numGrade += 0.5;
        }

        if((numGrade >= 1 && numGrade <= 5.5)){
            numGrade -= 1;
            System.out.println("The corresponding numeric grade of " + userGrade + " is " + numGrade);
        } else if(numGrade == 0){
            System.out.println("The corresponding numeric grade of " + userGrade + " is " + numGrade);
        } else if(!(numGrade >= 1 && numGrade <= 5)){
            System.out.println("Invalid input. Please retry.");
        } 
    }
}
