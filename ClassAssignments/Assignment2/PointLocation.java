package ClassAssignments.Assignment2;
import java.util.Scanner;

public class PointLocation {
    public static void main(String[] args){
    System.out.println("Welcome to Point Location! Please input a coordinate x, y. You may disregard the comma.");
    Scanner input = new Scanner(System.in);
        float x, y;

        x = input.nextFloat();
        y = input.nextFloat();

        if((x <= 4 && x >= -4) && (y <= 4 && y >= -4)){
            System.out.println("Is the point (" + x + ", " + y + ") inside the square? " + true);
        } else {
            System.out.println("Is the point (" + x + ", " + y + ") inside the square? " + false);
        }
    }
}
