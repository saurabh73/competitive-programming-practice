package competitive.programming.practice.platform.interviewbit.problem0020;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PowerOfTwoIntegers.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/power-of-two-integers/">https://www.interviewbit.com/problems/power-of-two-integers/</a>
 **/
public class PowerOfTwoIntegersTest extends BaseTest {


    protected PowerOfTwoIntegersTest() {
        super("/interviewbit/problem0020/", new PowerOfTwoIntegers());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

}