import com.tit.week04.day05.junit.advance_junit.date_formatter.DateFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormatterTest{
    private DateFormatter dateFormatter;
    @BeforeEach
    void setUp(){
        dateFormatter = new DateFormatter();
    }
    //test for formatDate
    @Test
    void testFormatDate(){
        String oringnalFormat = "2025-02-15";

        assertEquals("15-02-2025", dateFormatter.formatDate(oringnalFormat));
    }
}
