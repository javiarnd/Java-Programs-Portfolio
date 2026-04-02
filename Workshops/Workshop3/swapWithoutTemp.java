package Workshops.Workshop3;

public class swapWithoutTemp {
    public static void main(String[] args){
        int a = 6;
        int b = 7;

        System.out.println("Original values: a = " + a + ", b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("Swapped: a = " + a + ", b = " + b);
    }
    
}
