package competitive.programming.practice.platform.interviewbit.problem0023;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for MaxSumContiguousSubarray.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/max-sum-contiguous-subarray/">https://www.interviewbit.com/problems/max-sum-contiguous-subarray/</a>
 **/
public class MaxSumContiguousSubarrayTest extends BaseTest {

    protected MaxSumContiguousSubarrayTest() {
        super("/interviewbit/problem0023/", new MaxSumContiguousSubarray());
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