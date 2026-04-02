package Workshops.Workshop8;

public class methodPractice {
    public static boolean arePositive(int a, int b){
        if((a >= 0) && (b >= 0)){
            return true;
        }else{
            return false;
        }
    }

    public static double avgArray(int[] a){
        double sum = 0;
        for(int i = 0; i <= a.length - 1; i++){
            sum += a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args) {
        System.out.print("Testing digits 5 and 10");
        System.out.println(arePositive(5, 10) == true ? " true" : "false");

        System.out.print("Testing digits -1 and 5");
        System.out.println(arePositive(-1, 5) == false ? " true" : "false");

        int[] arr1 = {10, 20, 30};
        double result1 = avgArray(arr1);
        System.out.print("Testing array ({10, 20, 30})");
        System.out.println(result1 == 20.0 ? " PASS" : "FAIL result: " + result1);

        int[] arr2 = {5, 10};
        double result2 = avgArray(arr2);
        System.out.print("Testing array({5, 10})");
        System.out.println(result2 == 7.5 ? " PASS" : "FAIL result: " + result2);
        
    }
}
