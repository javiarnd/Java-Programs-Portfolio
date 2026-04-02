package ClassAssignments.Assignment3;
import java.util.Random;

public class canadianPostalCode {
    public static void main(String[] args) {
        Random rnd = new Random();
        String postalCode = 
        (char)(rnd.nextInt(26) + 'A') + ""
        + rnd.nextInt(10)
        + (char)(rnd.nextInt(26) + 'A') + " " 
        + rnd.nextInt(10)
        + (char)(rnd.nextInt(26) + 'A')
        + rnd.nextInt(10);

        System.out.println(postalCode);
    }
}
