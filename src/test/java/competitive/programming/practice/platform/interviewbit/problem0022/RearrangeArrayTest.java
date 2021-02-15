package competitive.programming.practice.platform.interviewbit.problem0022;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

/**
 * Test for RearrangeArray.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/rearrange-array/">https://www.interviewbit.com/problems/rearrange-array/</a>
 **/
public class RearrangeArrayTest extends BaseTest {

    private ByteArrayOutputStream buffer;

    protected RearrangeArrayTest() {
        super("/interviewbit/problem0022/", new RearrangeArray());
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