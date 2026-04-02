package Workshops.Workshop9;
/*The method returns true if the sum of the first array is
larger than the sum of the second array. 
The method returns false if the sum of the second array is larger than or
equal to the sum of the first array.*/

public class sumComparisonMethod {
    public static boolean arrayComparison(int[] in0, int[] in1){
        int sum0 = 0, sum1 = 0;
        for(int ii = 0; ii < in0.length; ii++){
            sum0 += in0[ii];
        }
         for(int jj = 0; jj < in1.length; jj++){
            sum1 += in1[jj];
        }

        if(sum0 > sum1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] iArr0 = {7, 3, -6};
        int[] iArr1 = {7, 3, -6, -1};
        System.out.println(arrayComparison(iArr0, iArr1));
    }
}
