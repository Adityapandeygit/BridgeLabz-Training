package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class FileProcessortest {
	private final String TEST_FILE = "testFile.txt";
    FileProcessor processor = new FileProcessor();

    // Cleanup after each test
    @AfterEach
    void cleanup() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit File Test";

        processor.writeToFile(TEST_FILE, content);
        String result = processor.readFromFile(TEST_FILE);

        assertEquals(content, result);
    }

    // ✅ Test File Exists After Writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(TEST_FILE, "Test Data");

        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistingFileThrowsException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("no_such_file.txt");
        });
    }
}
