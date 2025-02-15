import com.tit.week04.day05.junit.testing_timeout.RunningTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RunningTaskTest {
    private RunningTask runningTask;

    @BeforeEach
    void setUp(){
        //initialize object if running task
        runningTask = new RunningTask();
    }
    //test for long running task
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask(){
        assertThrows(TimeoutException.class , ()-> runningTask.longRunningTask());
    }
}
