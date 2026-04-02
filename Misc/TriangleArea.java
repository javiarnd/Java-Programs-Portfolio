package Misc;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            double x1, y1, x2, y2, x3, y3, s, area;
            double side1, side2, side3;
        System.out.print("Enter the coordinates of three points separated by spaces: ");
            x1 = input.nextDouble(); y1 = input.nextDouble();
            x2 = input.nextDouble(); y2 = input.nextDouble();
            x3 = input.nextDouble(); y3 = input.nextDouble();         
            
            side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            side2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            side3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            s = (side1 + side2 + side3) / 2;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is " + area);
    }
}

