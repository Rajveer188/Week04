import com.tit.week04.day05.junit.basic_test.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void setUp(){
        //create object of calculator class
        calculator = new Calculator();
    }
    //test for add unit
    @Test
    void testAdd(){
        assertEquals(5, calculator.add(3,2));
    }
    //test for subtract unit
    @Test
    void testSubtract(){
        assertEquals(2, calculator.subtract(10,8));
    }
    //test for divide unit
    @Test
    void testDivide(){
        assertEquals(2, calculator.divide(6,3));
    }
    //test for add unit
    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
