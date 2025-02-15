import com.tit.week04.day05.junit.advance_junit.temperature_converter.TemperatureConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp(){
        temperatureConverter = new TemperatureConverter();
    }
    //test for celsiusToFahrenheit
    @Test
    void testCelsiusToFahrenheit(){
        double celsius = 45;
        assertEquals(113, temperatureConverter.celsiusToFahrenheit(celsius));
    }
    //test for fahrenheitToCelsius
    @Test
    void testFahrenheitToCelsius(){
        double fahrenheit = 113;
        assertEquals(45, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }
}
