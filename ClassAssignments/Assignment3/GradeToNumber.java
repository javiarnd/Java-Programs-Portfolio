package ClassAssignments.Assignment3;
import java.util.Scanner;

public class GradeToNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grade to Number Program. Please enter a letter grade. (A-F)");
        Scanner input = new Scanner(System.in);
        char inChar = input.next().charAt(0);

        int numGrade = 'F' - (int) Character.toUpperCase(inChar);
        
        if((numGrade >= 1 && numGrade <= 5)){
            numGrade -= 1;
            System.out.println("The corresponding numeric grade of " + inChar + " is " + numGrade);
        } else if(numGrade == 0){
            System.out.println("The corresponding numeric grade of " + inChar + " is " + numGrade);
        } else if(!(numGrade >= 1 && numGrade <= 5)){
            System.out.println("Invalid input. Please retry.");
        }
    }
}
