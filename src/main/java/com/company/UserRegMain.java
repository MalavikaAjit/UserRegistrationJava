package com.company;



import java.util.Scanner;
import java.util.regex.Pattern;
interface IUserRegMain{
    boolean compare(String regEx, String input);
}
public class UserRegMain {

    private static IUserRegMain iUserRegMain = (regEx, input) -> {
            Pattern pattern = Pattern.compile(regEx);
            if (pattern.matcher(input).matches())
                return true;
            else
                return false;
    };
    public static boolean validateFirstName(String firstName) throws UserRegMainException {

        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (iUserRegMain.compare(pattern,firstName))
            return true;
        else
            throw new UserRegMainException("Invalid first name");
    }
    public static boolean validateLastName(String lastName) throws UserRegMainException {

        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (iUserRegMain.compare(pattern,lastName))
                return true;
        else
            throw new UserRegMainException("Invalid last name");
    }
    public static boolean validateEmail(String email) throws UserRegMainException {

        String pattern = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
        if (iUserRegMain.compare(pattern,email))
                return true;
        else
            throw new UserRegMainException("Invalid email");
    }
    public static boolean validatePhoneNo(String phoneNo) throws UserRegMainException {

        String pattern ="^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        if (iUserRegMain.compare(pattern,phoneNo))
            return true;
        else
            throw new UserRegMainException("Invalid phone no");
    }
    public static boolean validatePassword(String password) throws UserRegMainException {

        String pattern =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        if (iUserRegMain.compare(pattern,password))
            return true;
        else
            throw new UserRegMainException("Invalid password");
    }
    public static void main (String[] args) throws UserRegMainException {
        validateFirstName("Malavika");
        validateLastName("Ajit");
        validateEmail("malavikaAjit12@gmail.com");
        validatePhoneNo("91 8529637412");
        validatePassword("Password@123");

    }
}