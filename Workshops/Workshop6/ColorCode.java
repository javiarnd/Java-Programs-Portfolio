package Workshops.Workshop6;

public class ColorCode {

    public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomCharacter() { 
        char ch  = ' ';
        boolean bool = true;
        while(bool){
        ch = getRandomCharacter('0', 'F');
        if(!(ch >= 58 && ch <= 64)){
            bool = false;
        } else {
            continue;
        }
    }
        return ch;
    }


    public static void main(String[] args){
        String hexDecimalCode = " ";
        for (int ii = 0; ii < 7; ++ii){
        char ch = ColorCode.getRandomCharacter();
        hexDecimalCode += ch;
    }
        System.out.println(hexDecimalCode);
    }
}
