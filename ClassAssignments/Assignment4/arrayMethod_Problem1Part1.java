package ClassAssignments.Assignment4;

public class arrayMethod_Problem1Part1 {
    public static int findMax(int[] x){
        int max = x[0];
        for(int i = 1; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        System.out.println("The maximum value is: " + findMax(arr));
    }
}
