
import com.company.UserRegMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {

    UserRegMain userRegMain = new UserRegMain();

    @Test
    public void given_firstName_if_valid_should_return_true() { //if it is valid, boolean result is true ;test passed ;wont print anything
        boolean result = userRegMain.validateFirstName("Malavika");
        Assert.assertTrue("Happy", result);
    }

    @Test
    public void given_firstName_if_invalid_should_return_false() { //if it is invalid, boolean result is false ;test failed ;print sad
        boolean result = userRegMain.validateFirstName("malavika");
        Assert.assertTrue("Sad", result);
    }
    @Test
    public void given_lastName_if_valid_should_return_true() {
        boolean result = userRegMain.validateLastName("Ajit");
        Assert.assertTrue("Happy", result);
    }

    @Test
    public void given_lastName_if_invalid_should_return_false() {
        boolean result = userRegMain.validateLastName("ajit");
        Assert.assertTrue("Sad", result);
    }
    @Test
    public void given_email_if_valid_should_return_true() {
        boolean result = userRegMain.validateEmail("malavikaAjit12@gmail.com");
        Assert.assertTrue("Happy", result);
    }

    @Test
    public void given_email_if_invalid_should_return_false() {
        boolean result = userRegMain.validateEmail("malavika@123");
        Assert.assertTrue("Sad", result);
    }
    @Test
    public void given_phoneNo_if_valid_should_return_true() {
        boolean result = userRegMain.validatePhoneNo("91 8529637412");
        Assert.assertTrue("Happy", result);
    }

    @Test
    public void given_phoneNo_if_invalid_should_return_false() {
        boolean result = userRegMain.validatePhoneNo("25369");
        Assert.assertTrue("Sad", result);
    }
    @Test
    public void given_password_if_valid_should_return_true() {
        boolean result = userRegMain.validatePassword("Password123@");
        Assert.assertTrue("Happy", result);
    }

    @Test
    public void given_password_if_invalid_should_return_false() {
        boolean result = userRegMain.validatePassword("password");
        Assert.assertTrue("Sad", result);
    }
}
