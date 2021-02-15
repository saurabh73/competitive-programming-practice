package competitive.programming.practice.platform.interviewbit.problem0003;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for MaximumSumTriplet.java
 *
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/maximum-sum-triplet/">https://www.interviewbit.com/problems/maximum-sum-triplet/</a>
 **/
public class MaximumSumTripletTest extends BaseTest {


    protected MaximumSumTripletTest() {
        super("/interviewbit/problem0003/", new MaximumSumTriplet());
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