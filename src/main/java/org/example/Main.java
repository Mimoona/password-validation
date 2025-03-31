package org.example;


// create github repo

// method -check length --should be 8 characters long
// method - check if it has numbers
// method - check if it has upper/lowercase
// method - check frequently used passwords e.g 00000

// write test for length method   check with > 8 , < 8, =8
// write test for hasNumbers --yes/No
// write test for both alphabetcases ---all small--all caps--has both
// write test for common password --- few bad examples true --- unique false

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isCommonPassword("123pass"));
    }

    public static boolean isLengthValid(String password){
        return password.length() >= 8;
    }

    public static boolean containsNumbers(String password){
        for(int i=0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowercase(String password){
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for(char c : password.toCharArray()){

            if(Character.isLowerCase(c)){
                hasLowerCase = true;
            }

            if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }
        }

        return hasLowerCase && hasUpperCase;
    }

    public static boolean isCommonPassword(String password){
        String[] commonPasswords = {"1234abcd", "password1", "Aa345678", "123pass"};
        for(String commonPassword: commonPasswords){
            if(commonPassword.equals(password)){
                return true;
            }
        }
        return false;
    }
}
