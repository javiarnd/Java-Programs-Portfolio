package Misc;
import java.util.Scanner;

public class PasswordCheck {

    public static boolean containsUpper(String input){
        for(int ii = 0; ii < input.length(); ii++){
            if(Character.isUpperCase(input.charAt(ii))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLower(String input){
        for(int ii = 0; ii < input.length(); ii++){
            if(Character.isLowerCase(input.charAt(ii))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumber(String input){
        for(int ii = 0; ii < input.length(); ii++){
            if(Character.isDigit(input.charAt(ii))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecial(String input){
        String specialChar = "@#$%*+";
        for(int ii = 0; ii < input.length(); ii++){
            for(int jj = 0; jj < specialChar.length(); jj++){
                if(input.charAt(ii) == specialChar.charAt(jj)){
                    return true;
                }
            }
        }
        return false;
    }

    public static String charTypeRules(boolean upper, boolean lower, boolean num, boolean special){
        String result = "";
        if(upper == false){
            result += "at least one uppercase letter, ";
        }
        if(lower == false){
            result += "at least one lowercase letter, ";
        }
        if(num == false){
            result += "at least one number, ";
        }
        if(special == false){
            result += "at least one special character (@#$%*+).";
        }
        return result;
    }       
    public static void main(String[] args) {
        System.out.println("Welcome! This program is for checking the strength of a password!");
        System.out.println("Please input your password: ");
        Scanner input = new Scanner(System.in);
       
        while(true){
        String userPass = input.nextLine();
            if(userPass.equals("Exit!")){
                System.out.println("OK, exit now.");
                break;
            }
            if(userPass.length() <= 11 || userPass.isEmpty()){
            System.out.println("A qualified password should contain at least 12 characters. Please input again: ");
            continue;
            }
            if(userPass.length() >= 12 && containsUpper(userPass) && containsLower(userPass) && containsNumber(userPass) && containsSpecial(userPass)){
                System.out.println("This is a qualified password. Please input again: ");
            continue;
            } else {
                System.out.println("This password is not qualified. It should contain " +
                charTypeRules(containsUpper(userPass), containsLower(userPass), containsNumber(userPass), containsSpecial(userPass)));
            }
        }
    }
}
