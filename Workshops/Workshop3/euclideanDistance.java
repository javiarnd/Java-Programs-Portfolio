package Workshops.Workshop3;
import java.util.Scanner;

public class euclideanDistance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.println("Welcome to the Euclidean Distance calculator! Enter x1, y1, x2, y2, respectively.");
        x1 = input.nextDouble(); y1 = input.nextDouble(); x2 = input.nextDouble(); y2 = input.nextDouble();
        double euclideanDistance = (Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        String twoDecimalpoints = String.format("%.2f", euclideanDistance);
        System.out.println("The euclidian distance between " + "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + twoDecimalpoints);

    }
    
}
