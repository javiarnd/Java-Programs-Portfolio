package Workshops.Workshop9;

public class evenOddMethod {
    public static int compareEvenOdd(int[] in){
        int even = 0, odd = 0;
        int result = 0;
        for(int ii = 0; ii < in.length; ii++){
            if(in[ii] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
          if(even > odd){
                result = 1;
            } else if(odd == even){
                result = 0;
            } else if(odd > even){
                result = -1;
            }
            return result;
    }

    public static void main(String[] args) {
        int[] iArr = {30, 21, -38, -29, 35, 0, 53, -27, 20, -19};
        System.out.println(compareEvenOdd(iArr)); // sign = -1

        int[] iArr2 = {30, 21, -38, -29, 35, 0, 53, -27, 20, 4};
        System.out.println(compareEvenOdd(iArr2)); // sign = 0
    }
}
