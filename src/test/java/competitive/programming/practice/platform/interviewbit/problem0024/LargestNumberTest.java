package competitive.programming.practice.platform.interviewbit.problem0024;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for LargestNumber.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/largest-number/">https://www.interviewbit.com/problems/largest-number/</a>
 **/
public class LargestNumberTest extends BaseTest {

    protected LargestNumberTest() {
        super("/interviewbit/problem0024/", new LargestNumber());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }
}