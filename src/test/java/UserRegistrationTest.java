import com.tit.week04.day05.junit.advance_junit.testing_user_registration.UserRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp(){
        userRegistration = new UserRegistration();
    }
    //test registerUser unit
    @Test
    void testregisterUser(){
        String correctUsername = "Rajveer_188";
        String correctEmail = "rajveer@gmail.com";
        String correctPassword = "Rajveer@123";

        String wrongUsername = "raj188";
        String wrongEmail = "rajveer@gmail.cm";
        String wrongPassword = "password";

        //test with right credential
        assertTrue(userRegistration.registerUser(correctUsername, correctEmail, correctPassword));
        //test with wrong credential
        assertThrows(IllegalArgumentException.class, ()-> userRegistration.registerUser(wrongUsername, wrongEmail, wrongPassword));

    }
}
