import com.tit.week04.day05.junit.file_handling.FileProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private static String testFile = "D:\\Com\\Capgemini_Training\\JUnit\\src\\main\\resources\\TextFile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }
    //test to check The content is written and read correctly.
    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hey, it's me Rajveer";
        fileProcessor.writeToFile(testFile, content);
        assertEquals(content, fileProcessor.readFromFile(testFile));
    }
    //test to check The file exists after writing.
    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFile, "rajveer");
        assertTrue(new File(testFile).exists());
    }

    //test to Handling of IOException when the file does not exist
    @Test
    void testIOExceptionWhenFileDoesNotExist() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonExistent.txt"));
    }
}
