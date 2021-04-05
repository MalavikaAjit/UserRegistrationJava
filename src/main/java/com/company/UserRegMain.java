package com.company;

public class UserRegMain {

    public static boolean validateFirstName(String firstName){

        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if (firstName.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean validateLastName(String lastName) {

        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if (lastName.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {

        String pattern = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";

        if (email.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validatePhoneNo(String phoneNo) {

        String pattern ="^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";

        if (phoneNo.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validatePassword(String password) {

        String pattern =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        if (password.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args){
        validateFirstName("Malavika");
        validateLastName("Ajit");
        validateEmail("malavikaAjit12@gmail.com");
        validatePhoneNo("91 8529637412");
        validatePassword("Password@123");

    }
}