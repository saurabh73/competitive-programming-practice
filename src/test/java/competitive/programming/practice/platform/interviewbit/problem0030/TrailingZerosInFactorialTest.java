package competitive.programming.practice.platform.interviewbit.problem0030;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for TrailingZerosInFactorial.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/trailing-zeros-in-factorial/">https://www.interviewbit.com/problems/trailing-zeros-in-factorial/</a>
 **/
public class TrailingZerosInFactorialTest extends BaseTest {


    protected TrailingZerosInFactorialTest() {
        super("/interviewbit/problem0030/", new TrailingZerosInFactorial());
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