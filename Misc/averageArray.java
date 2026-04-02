package Misc;
import java.util.Scanner;

public class averageArray {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int ii = 0; ii < 10; ii++) {
            arr[ii] = input.nextInt();
            sum += arr[ii];
        }
        double average = sum/10;
        System.out.println("This is the average of the array: " + average);
    }
}
