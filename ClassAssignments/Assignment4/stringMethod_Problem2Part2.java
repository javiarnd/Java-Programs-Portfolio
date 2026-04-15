package ClassAssignments.Assignment4;

public class stringMethod_Problem2Part2 {
    public static boolean equals(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int ii = 0; ii < s1.length(); ii++){
            if(s1.charAt(ii) != s2.charAt(ii)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String test1 = "Hello World";
        String test2 = "Hello World";
        String test3 = "Hello world";
        System.out.println(equals(test1, test2)); //Should come out to true
        System.out.println(equals(test1, test3)); //Should come out to false because of the capital W in test1 and lowercase w in test3
    }
}
