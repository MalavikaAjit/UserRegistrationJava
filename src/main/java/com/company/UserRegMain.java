
package com.company;

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
    public static void validateEmail() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");
        String email =scan.next();
        String pattern = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
        System.out.println("email is " +email);
        System.out.println("Is the email valid? " + email.matches(pattern));

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
        String pattern = "^[a-zA-Z0-9]{8}$";
        System.out.println("password is " +password);
        System.out.println("Is the password valid? " + password.matches(pattern));

    }
    public static void main(String[] args) {
        validateFirstName();
        validateLastName();
        validateEmail();
        validatePhoneno();
        validatePassword();
    }
}