package competitive.programming.practice.platform.interviewbit.problem0035;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for MaximumAbsoluteDifference.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/maximum-absolute-difference/">https://www.interviewbit.com/problems/maximum-absolute-difference/</a>
 **/
public class MaximumAbsoluteDifferenceTest extends BaseTest {


    protected MaximumAbsoluteDifferenceTest() {
        super("/interviewbit/problem0035/", new MaximumAbsoluteDifference());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
}