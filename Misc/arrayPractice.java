package Misc;
public class arrayPractice {

    public static double[] arrayProbability(byte[] input){
        double probability[] = new double[2];
        int zeroSum = 0, oneSum = 0;

        for (int ii = 0; ii < input.length; ii++) {
            if(input[ii] == 0){
                zeroSum++;
            }
            if(input[ii] == 1){
                oneSum++;
            }
        }

        probability[0] = (double) zeroSum/input.length;
        probability[1] = (double) oneSum/input.length;  
        return probability;
    }
    public static void main(String[] args) {
        byte bit[] = {1, 1, 1, 0, 0};
        double[] results = arrayProbability(bit);

        for(int ii = 0; ii < results.length; ii++) {
        System.out.println(results[ii] + " ");
        }
    }
}
