package competitive.programming.practice.platform.interviewbit.problem0008;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for LargeFactorial.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/large-factorial/">https://www.interviewbit.com/problems/large-factorial/</a>
 **/
public class LargeFactorialTest extends BaseTest {

    protected LargeFactorialTest() {
        super("/interviewbit/problem0008/", new LargeFactorial());
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