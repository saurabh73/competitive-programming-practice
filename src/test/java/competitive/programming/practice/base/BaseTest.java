package competitive.programming.practice.base;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class BaseTest {

    protected final String resourcePath;
    protected final ISolution solution;
    protected ByteArrayOutputStream buffer;

    protected BaseTest(String resourcePath, ISolution solution) {
        this.resourcePath = resourcePath;
        this.solution = solution;
        this.buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
    }

    public void runTest(String inputFile, String outputFile) throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream(resourcePath + inputFile);
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream(resourcePath + outputFile);
        // Call Method Under Test
        solution.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        assertNotNull(outPutStream);
        String expected = IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }

     @AfterEach
     public void cleanup() {
        this.buffer.reset();
     }

}
