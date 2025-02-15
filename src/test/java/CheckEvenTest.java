import com.tit.week04.day05.junit.parameterized_tests.CheckEven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckEvenTest {
    private CheckEven checkEven;

    @BeforeEach
    void setUp(){
        checkEven = new CheckEven();
    }

    //test for isEven unit
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void testIsEven(int number){
        boolean expected = (number%2 == 0);
        assertEquals(expected, checkEven.isEven(number));
    }
}
