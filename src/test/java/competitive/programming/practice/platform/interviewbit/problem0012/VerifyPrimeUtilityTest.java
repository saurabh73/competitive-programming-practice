package competitive.programming.practice.platform.interviewbit.problem0012;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for VerifyPrime.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/verify-prime/">https://www.interviewbit.com/problems/verify-prime/</a>
 **/
public class VerifyPrimeUtilityTest extends BaseTest {

    protected VerifyPrimeUtilityTest() {
        super("/interviewbit/problem0012/", new VerifyPrime());
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