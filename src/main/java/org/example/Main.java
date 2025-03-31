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
    }

    public static boolean isLengthValid(String password){
        return true;
    }

    public static boolean containsNumbers(String password){
        return true;
    }

    public static boolean containsUpperAndLowercase(String password){
        return true;
    }

    public static boolean isCommonPassword(String password){
        return false;
    }
}
