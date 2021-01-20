package competitive.programming.practice.hackerearth.problem0002;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BishuAndHisGirlfriendTest {

    private ByteArrayOutputStream buffer;
    private String testFilePath;
    private BishuAndHisGirlfriend problem;

    @BeforeEach
    void setup() {
        buffer = new ByteArrayOutputStream();
        testFilePath = "src/test/java/competitive/programming/practice/hackerearth/problem0002/";
        System.setOut(new PrintStream(buffer));
        problem = new BishuAndHisGirlfriend();
    }

    @Test
    void testSolveInput1() throws Exception {
        // Call Method Under Test
        FileInputStream inputStream = new FileInputStream(new File(testFilePath + "input1.txt"));
        problem.solve(inputStream);
        //Assertion
        String actual = buffer.toString().trim();
        String expected = new String(Files.readAllBytes(Paths.get( testFilePath + "output1.txt"))).trim();
        assertEquals(expected, actual);
    }

    @AfterEach
    void cleanup() {
        buffer.reset();
    }
}