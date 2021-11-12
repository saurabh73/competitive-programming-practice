package competitive.programming.practice.platform.interviewbit.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for MaxNonNegativeSubArray.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/max-non-negative-subarray/">https://www.interviewbit.com/problems/max-non-negative-subarray/</a> 
*
**/
public class MaxNonNegativeSubArrayTest extends BaseTest {

    public MaxNonNegativeSubArrayTest() {
        super("/interviewbit/problem0001/", new MaxNonNegativeSubArray());
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