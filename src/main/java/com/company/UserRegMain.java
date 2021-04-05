
package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegMain {
    public static void validateFirstName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName =scan.next();
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("first name is " +firstName);
        System.out.println("Is the First name valid? " + firstName.matches(pattern));

    }
    public static void validateLastName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Last name");
        String lastName =scan.next();
        String pattern ="^[A-Z]{1}[a-z]{2,}$";
        System.out.println("last name is " +lastName);
        System.out.println("Is the Last name valid? " + lastName.matches(pattern));

    }
    public static void validateEmail(ArrayList<String> emails) {
        String pattern = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
        System.out.println("email is " +emails);
        for ( String email:emails) {
            System.out.println("Is the email valid? " + email.matches(pattern));
        }
    }
    public static void validatePhoneno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Phone number");
        String phoneNo =scan.next();
        String pattern ="^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        System.out.println("phone no is " +phoneNo);
        System.out.println("Is the phone no valid? " + phoneNo.matches(pattern));

    }
    public static void validatePassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String password =scan.next();
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        System.out.println("password is " +password);
        System.out.println("Is the password valid? " + password.matches(pattern));

    }
    public static void main(String[] args) {
        validateFirstName();
        validateLastName();
        validatePhoneno();
        validatePassword();

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");
        validateEmail(emails);
    }

}