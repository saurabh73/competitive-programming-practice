package competitive.programming.practice.platform.interviewbit.problem0021;
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
* Test for NextSimilarNumber.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/next-similar-number/">https://www.interviewbit.com/problems/next-similar-number/</a> 
*
**/
public class NextSimilarNumberTest {

    private ByteArrayOutputStream buffer;

    @BeforeEach
    public void setup() {
        buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
    }

        

    @Test
    public void case1Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/input1.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/output1.txt");
        // Call Method Under Test
        ISolution problem = new NextSimilarNumber();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }
        

    @Test
    public void case2Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/input2.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/output2.txt");
        // Call Method Under Test
        ISolution problem = new NextSimilarNumber();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }

    @Test
    public void case3Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/input3.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/output3.txt");
        // Call Method Under Test
        ISolution problem = new NextSimilarNumber();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }


    @Test
    public void case4Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/input4.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/output4.txt");
        // Call Method Under Test
        ISolution problem = new NextSimilarNumber();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset()).trim();
        assertEquals(expected, actual);
    }

    @Test
    public void case5Test() throws Exception {
        // Input
        InputStream inputStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/input5.txt");
        // Output
        InputStream outPutStream = this.getClass().getResourceAsStream("/interviewbit/problem0021/output5.txt");
        // Call Method Under Test
        ISolution problem = new NextSimilarNumber();
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