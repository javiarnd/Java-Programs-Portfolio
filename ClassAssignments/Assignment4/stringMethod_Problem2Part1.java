package ClassAssignments.Assignment4;

public class stringMethod_Problem2Part1 {
    public static boolean validString(String s){
        int digitCount = 0;
        int letterCount = 0;

        if(s.length() == 0){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char index = s.charAt(i);
            if(Character.isDigit(index)){
                digitCount++;
            }
            if(Character.isLetter(index)){
                letterCount++;
            }
        }
        return (digitCount > letterCount);
    }

    public static void main(String[] args) {
        String test1 = "111222aaa";
        String test2 = "111aaaaaa";
        System.out.println(validString(test1));
        System.out.println(validString(test2));
    }
}
