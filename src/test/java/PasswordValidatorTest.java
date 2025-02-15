import com.tit.week04.day05.junit.advance_junit.testing_password_strength.PasswordValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator;

    @BeforeEach
    void setUp(){
        passwordValidator = new PasswordValidator();
    }
    //test for validate password
    @Test
    void testValidatePassword(){
        //password
        String strongPassword = "rAJVEEr123";
        String weakPassword = "raj123";

        //test unit
        assertTrue(passwordValidator.validatePassword(strongPassword));
        assertFalse(passwordValidator.validatePassword(weakPassword));
    }

}
