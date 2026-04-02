package Workshops.Workshop9;

public class negativeNumMethod {
    public static int numNegativeElements(int[] in){
        int negativeElements = 0;
        for(int ii = 0; ii < in.length; ii++){
            if(in[ii] < 0){
                negativeElements++;
            }
        }
        return negativeElements;
    }
    public static void main(String[] args) {
        int[] iArr = {-30, 21, -39, -29, 35, 0, 53, -27, 21, -19};
        int count = numNegativeElements(iArr);
        System.out.println("The number of negative elements in the array is: " + count);
    }
}
