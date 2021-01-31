package competitive.programming.practice.platform.geeksforgeeks.problem0006;
import competitive.programming.practice.base.ISolution;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
*
* Test for CoinsOfGeekland.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/">https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/</a> 
*
**/
public class CoinsOfGeeklandTest {

    private ByteArrayOutputStream buffer;

    @BeforeEach
    public void setup() {
        buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
    }

        

    @Test
    public void case1Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/geeksforgeeks/problem0006/input1.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/geeksforgeeks/problem0006/output1.txt");
        // Call Method Under Test
        ISolution problem = new CoinsOfGeekland();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }

    @Test
    public void case2Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/geeksforgeeks/problem0006/input2.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/geeksforgeeks/problem0006/output2.txt");
        // Call Method Under Test
        ISolution problem = new CoinsOfGeekland();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }
    

    @AfterEach
    public void cleanup() {
        buffer.reset();
    }
}