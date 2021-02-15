package competitive.programming.practice.platform.interviewbit.problem0007;
import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for MaxNonNegativeSubArray.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/max-non-negative-subarray/">https://www.interviewbit.com/problems/max-non-negative-subarray/</a> 
*
**/
public class MaxNonNegativeSubArrayTest extends BaseTest {

    protected MaxNonNegativeSubArrayTest() {
        super("/interviewbit/problem0007/", new MaxNonNegativeSubArray());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output2.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }
}