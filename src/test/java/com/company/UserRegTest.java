package com.company;
import com.company.UserRegMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {

    UserRegMain userRegMain = new UserRegMain();

    @Test
    public void given_firstName_if_valid_should_return_true() { //if it is valid, boolean result is true ;test passed ;wont print anything
        try {
            boolean result = userRegMain.validateFirstName("Malavika");
        } catch (UserRegMainException e) {
            Assert.assertEquals("Invalid first name", e.getMessage());
        }
    }
    @Test
    public void given_firstName_if_invalid_should_return_false() { //if it is invalid, boolean result is false ;test failed ;print sad

       try {
           boolean result = userRegMain.validateFirstName("malavika");
       }
       catch (UserRegMainException e) {
           Assert.assertEquals("Invalid first name", e.getMessage());
       }
    }
    @Test
    public void given_lastName_if_valid_should_return_true() {
       try {
           boolean result = userRegMain.validateLastName("Ajit");
       }
       catch (Exception e) {
           Assert.assertEquals("Invalid last name",e.getMessage());
       }
    }

    @Test
    public void given_lastName_if_invalid_should_return_false() {
       try {
           boolean result = userRegMain.validateLastName("ajit");
       }
       catch (Exception e) {
           Assert.assertEquals("Invalid last name", e.getMessage());
       }
    }
    @Test
    public void given_email_if_valid_should_return_true() {
        try {
            boolean result = userRegMain.validateEmail("malavikaAjit12@gmail.com");
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid email",e.getMessage());
        }
    }

    @Test
    public void given_email_if_invalid_should_return_false() {
       try {
           boolean result = userRegMain.validateEmail("malavika@123");
       }
       catch (Exception e) {
           Assert.assertEquals("Invalid email", e.getMessage());
       }
    }
    @Test
    public void given_phoneNo_if_valid_should_return_true() {
       try{
           boolean result = userRegMain.validatePhoneNo("91 8529637412");
       }
       catch (Exception e) {
           Assert.assertEquals("Invalid phone no", e.getMessage());
       }
    }
    @Test
    public void given_phoneNo_if_invalid_should_return_false() {
       try{
           boolean result = userRegMain.validatePhoneNo("25369");
       }
       catch (Exception e) {
           Assert.assertEquals("Invalid phone no", e.getMessage());
       }
    }
    @Test
    public void given_password_if_valid_should_return_true() {
        try {
            boolean result = userRegMain.validatePassword("Password123@");
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid password", e.getMessage());
        }
    }
    @Test
    public void given_password_if_invalid_should_return_false() {
        try {
            boolean result = userRegMain.validatePassword("password");
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid password",  e.getMessage());
        }
    }
}
