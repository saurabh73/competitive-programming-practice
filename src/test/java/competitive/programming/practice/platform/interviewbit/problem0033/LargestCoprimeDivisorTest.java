package competitive.programming.practice.platform.interviewbit.problem0033;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for LargestCoprimeDivisor.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/largest-coprime-divisor/">https://www.interviewbit.com/problems/largest-coprime-divisor/</a>
 **/
public class LargestCoprimeDivisorTest extends BaseTest {

    protected LargestCoprimeDivisorTest() {
        super("/interviewbit/problem0033/", new LargestCoprimeDivisor());
    }


    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }


    @Test
    public void case4Test() throws Exception {
        runTest("input4.txt", "output4.txt");
    }
}