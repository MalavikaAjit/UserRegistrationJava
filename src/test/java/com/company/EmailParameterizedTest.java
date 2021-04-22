package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {

    private final String emailTest;
        private final boolean expectedResult;

        public EmailParameterizedTest(String emailTest, boolean expectedResult)
        {
            this.emailTest = emailTest;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> input() {
            return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},
                    {"abc-10@yahoo.com", true},
                    {"abc.1010@yahoo.com", true},
                    {"abc222@abccom", true},
                    {"abc.100@abc.com.au", true},
                    {"abc@1.com", true},
                    {"abc123@gamil.a", false},
                    {"abc123@.com", false},
                    {"abc@gmail.com.1a", false},
                    {"abc..4004@gamil.com", false},
                    {"abc-100@abc.net", true}});
        }
        @Test
        public void givenEmail_ShouldReturnAccordingToThe_Test() throws UserRegMainException {
            UserRegMain userRegMain = new UserRegMain();
            boolean result = userRegMain.validateEmail(emailTest);
            Assert.assertEquals(expectedResult, result);
        }
}
