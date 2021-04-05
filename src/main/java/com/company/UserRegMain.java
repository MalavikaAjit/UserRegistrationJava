
package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegMain {
    //validating user input first name
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
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("last name is " +lastName);
        System.out.println("Is the Last name valid? " + lastName.matches(pattern));

    }
    public static void main(String[] args) {
        validateFirstName();
        validateLastName();
    }
}