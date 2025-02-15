import com.tit.week04.day05.junit.test_string_methods.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    private static StringUtils stringUtils;

    @BeforeAll
    static void setUp(){
        //create object of stringUtils
        stringUtils = new StringUtils();
    }
    //test for reverse unit
    @Test
    void testReverse(){
        assertEquals("reevjaR", stringUtils.reverse("Rajveer"));
    }
    //test for palindrome unit
    @Test
    void testIsPalindrome(){
        assertTrue(stringUtils.isPalindrome("kanak"));
    }
    //test for touppercase unit
    @Test
    void testToUpperCaseTest(){
        assertEquals("RAJVEER", stringUtils.toUpperCase("rajveer"));
    }
}
