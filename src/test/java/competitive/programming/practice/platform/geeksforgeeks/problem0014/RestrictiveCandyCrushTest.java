package competitive.programming.practice.platform.geeksforgeeks.problem0014;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

/**
 * Test for RestrictiveCandyCrush.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/">https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/</a>
 **/
public class RestrictiveCandyCrushTest extends BaseTest {

    private ByteArrayOutputStream buffer;

    protected RestrictiveCandyCrushTest() {
        super("/geeksforgeeks/problem0014/", new RestrictiveCandyCrush());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output2.txt");
    }
}