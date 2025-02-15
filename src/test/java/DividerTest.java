import com.tit.week04.day05.junit.test_exception_handling.Divider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DividerTest {
    private Divider divider;

    @BeforeEach
    void setUp(){
        divider = new Divider();
    }
    //test for divide unit
    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class, ()->divider.divide(1, 0));
    }
}
