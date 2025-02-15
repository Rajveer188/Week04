import com.tit.week04.day05.junit.testing_annotations.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    void connectDatabase(){
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }
    @Test
    void testPerformOperations1(){
        assertTrue(databaseConnection.performOperations());
    }
    @Test
    void testPerformOperations2(){
        assertTrue(databaseConnection.performOperations());
    }
    @AfterEach
    void disconnectDatabase(){
        databaseConnection.disconnect();
    }

}
