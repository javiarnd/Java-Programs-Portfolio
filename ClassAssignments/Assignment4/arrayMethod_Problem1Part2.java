package ClassAssignments.Assignment4;

public class arrayMethod_Problem1Part2 {
    public static double[] findFrequency(byte[] x){
        double probability[] = new double[2];
        int zeroSum = 0, oneSum = 0;

        for (int ii = 0; ii < x.length; ii++) {
            if(x[ii] == 0){
                zeroSum++;
            }
            if(x[ii] == 1){
                oneSum++;
            }
        }
        probability[0] = (double) zeroSum/x.length;
        probability[1] = (double) oneSum/x.length;  
        return probability;
    }

    public static void main(String[] args) {
        byte bit[] = {1, 1, 1, 0, 0};
        double[] results = findFrequency(bit);

        for(int ii = 0; ii < results.length; ii++) {
        System.out.println(results[ii] + " ");
        }
    }
}
