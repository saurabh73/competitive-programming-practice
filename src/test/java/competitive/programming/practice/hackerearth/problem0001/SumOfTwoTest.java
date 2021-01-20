package competitive.programming.practice.hackerearth.problem0001;

import competitive.programming.practice.base.ISolution;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfTwoTest {

    private ByteArrayOutputStream buffer;
    private String testFilePath;

    @BeforeEach
    void setup() {
        buffer = new ByteArrayOutputStream();
        testFilePath = "src/test/java/competitive/programming/practice/hackerearth/problem0001/";
        System.setOut(new PrintStream(buffer));
    }

    @Test
    void testSolveInput1() throws Exception {
        // Input
        FileInputStream inputStream = new FileInputStream(new File(testFilePath + "input1.txt"));
        // Output
        FileInputStream outPutStream = new FileInputStream(new File(testFilePath + "output1.txt"));
        // Call Method Under Test
        ISolution problem = new SumOfTwo();
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected =  IOUtils.toString(outPutStream, Charset.defaultCharset());
        assertEquals(expected, actual);
    }

    @AfterEach
    void cleanup() {
        buffer.reset();
    }
}